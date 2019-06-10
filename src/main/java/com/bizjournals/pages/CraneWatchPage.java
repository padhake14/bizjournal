package com.bizjournals.pages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bizjournals.base.TestBase;

public class CraneWatchPage extends TestBase {

	@FindBy(xpath = "//div[@class=\"module__body\"]/div/a")
	List<WebElement> checked;

	public CraneWatchPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyNews() {
		String[] list = {
				"APR 25, 2019, 5:00 AM CDT Royal Capital apartments, restaurant near Fiserv Forum set for summer completion: Slideshow",
				"APR 22, 2019, 3:00 PM CDT Milwaukee County's last Park East block going back on the market",
				"APR 22, 2019, 2:46 PM CDT Wangard's Harbor District apartments endorsed by Milwaukee Plan Commission",
				"APR 15, 2019, 11:00 AM CDT Bradley Foundation moving to Hammes Co.'s downtown Milwaukee office building",
				"APR 9, 2019, 11:37 AM CDT Redeveloped Grand Avenue seeing high demand for tenant space as city panel OKs $9M grant",
				"APR 8, 2019, 1:38 PM CDT 300 more apartments planned in Oak Creek",
				"APR 4, 2019, 4:04 PM CDT Inside look at construction of new downtown Milwaukee BMO Tower: Slideshow",
				"APR 4, 2019, 12:30 PM CDT Walker's Point affordable apartments among seven tax credit winners",
				"APR 3, 2019, 3:53 PM CDT Boulder still working in Wauwatosa after rejection of development that includes Tesla showroom",
				"APR 3, 2019, 2:30 PM CDT Jeffers buys riverside Walker's Point building for restoration",
				"APR 3, 2019, 8:49 AM CDT Ogden planning 76 apartments on Water Street in Milwaukee's east side",
				"APR 1, 2019, 2:53 PM CDT Cobalt's West Quarter land deals completed, contractors moving in",
				"MAR 31, 2019, 6:00 PM CDT Wangard plans 200 apartments on Harbor District site between Komatsu HQ, Michels",
				"MAR 29, 2019, 10:04 AM CDT MAC restoration brings new hotel operator to Wisconsin",
				"MAR 20, 2019, 3:44 PM CDT Menomonee Falls plant for DRS moving forward",
				"MAR 20, 2019, 6:24 AM CDT Goodbye, Grand Avenue — See inside the ongoing demolition: Slideshow",
				"MAR 17, 2019, 6:00 PM CDT Irgens to buy 25 acres of Innovation Campus in Wauwatosa for offices",
				"MAR 14, 2019, 1:04 PM CDT PEDAL POWER Bikes to roll at Mandel's Ballpark Commons apartments",
				"MAR 14, 2019, 1:00 PM CDT Ballpark Commons to add 265 apartments from Mandel Group",
				"MAR 13, 2019, 3:54 PM CDT WHAT'S NEXT Amazon.com's Oak Creek developer plans more projects in Yorkville",
				"MAR 10, 2019, 6:00 PM CDT Jeffers' new Husch Blackwell-anchored office to finance streetscape work",
				"MAR 8, 2019, 10:41 AM CST Kinn Guesthouse owner proposes boutique hotel in downtown Milwaukee",
				"MAR 7, 2019, 2:58 PM CST Hub640 redevelopment in downtown Milwaukee secures $26.6M loan",
				"MAR 7, 2019, 10:59 AM CST Milwaukee to consider $9M in aid for Grand Avenue redevelopment",
				"MAR 7, 2019, 5:30 AM CST Rexnord leasing downtown Milwaukee office for up to 25 years",
				"MAR 6, 2019, 5:00 AM CST See the Easton apartments, which are set to open near Brady Street: Slideshow",
				"MAR 5, 2019, 1:49 PM CST Marriott hotel by Mayfair mall starts construction",
				"MAR 4, 2019, 5:00 AM CST New apartments open in former Park East Hotel structure: Slideshow",
				"MAR 3, 2019, 8:00 AM CST Ballpark Commons stadium readies for spring opening in Franklin: Slideshow",
				"FEB 26, 2019, 9:59 AM CST Chicago cafe Fairgrounds coming to Milwaukee this summer",
				"FEB 25, 2019, 2:48 PM CST Building rehabs to launch West Quarter redevelopment next month",
				"FEB 20, 2019, 3:49 PM CST Bay View's Alchemist Theatre building to be restored after sale",
				"FEB 19, 2019, 12:21 PM CST Chicago developer HSA planning a third industrial building in Oak Creek",
				"FEB 12, 2019, 4:17 PM CST Tesla showroom, Chase bank and Cafe Zupas advance in Wauwatosa",
				"FEB 7, 2019, 7:00 PM CST EXECUTIVE PROFILE Developer Josh Krsnak polishing up Westown",
				"FEB 7, 2019, 9:00 AM CST Mayfair Collection's next phase includes offices, 750 apartments, senior housing tower",
				"FEB 4, 2019, 12:25 PM CST Fourth tenant announced for Irgens' BMO Tower in Milwaukee",
				"FEB 4, 2019, 10:51 AM CST Café Zupas, possible hotel planned for site near Mayfair Collection",
				"JAN 31, 2019, 2:37 PM CST UPFRONT Mandel may seek city help for lakefront apartments",
				"JAN 30, 2019, 4:21 PM CST Bay View apartment developer seeks rezoning despite opponents",
				"JAN 29, 2019, 12:56 PM CST Indianapolis developer buys Milwaukee site for speculative building",
				"JAN 29, 2019, 10:07 AM CST Heartland Advisors moving to BMO Tower",
				"JAN 25, 2019, 12:14 PM CST Milwaukee Soldiers Home theater, chapel attract just one restoration proposal",
				"JAN 24, 2019, 4:30 PM CST CLOSER LOOK Wangard has bigger plans for Oconomowoc beyond Olympia Resort",
				"JAN 22, 2019, 4:45 PM CST Timber-framed apartment tower in downtown Milwaukee advances",
				"JAN 21, 2019, 7:00 AM CST Milwaukee Downtown BID moving to former Grand Avenue",
				"JAN 18, 2019, 12:06 PM CST Olympia Resort hotel in Oconomowoc to become apartments",
				"JAN 18, 2019, 8:37 AM CST Home2 Suites coming to West Allis",
				"JAN 10, 2019, 5:00 PM CST Ravine Park Partners plans apartments in downtown Milwaukee, Kenosha County",
				"JAN 8, 2019, 10:11 AM CST Irgens hires GM for BMO Tower in downtown Milwaukee",
				"JAN 3, 2019, 12:19 PM CST $18M Perlick plant rehab would add affordable apartments to Milwaukee",
				"JAN 3, 2019, 11:53 AM CST 90 apartments, stores proposed in Walker's Point",
				"DEC 30, 2018, 6:00 PM CST Real estate market already looks solid for 2019, but what's next?",
				"DEC 26, 2018, 11:40 AM CST Amazon roadwork plans in Oak Creek call for 7 lanes on 13th Street",
				"DEC 25, 2018, 11:00 AM CST Hammes Co. selling group of North Carolina properties for $52 million",
				"DEC 24, 2018, 5:00 AM CST Real estate risks were largely rewarded in 2018: Year in Review",
				"DEC 24, 2018, 5:00 AM CST Michels uses $100 million Milwaukee project to teach MSOE students",
				"DEC 23, 2018, 6:00 PM CST Cobalt's West Allis project awarded tax credits; work to start in 2019",
				"DEC 19, 2018, 9:09 PM CST Bay View apartment proposal scaled back",
				"DEC 19, 2018, 5:00 AM CST MSO's Warner Grand Theatre renovation reveals long-hidden features: Slideshow",
				"DEC 18, 2018, 12:54 PM CST Komatsu Mining HQ, Michels' River 1 projects win city financing",
				"DEC 14, 2018, 6:00 AM CST UPFRONT Husch Blackwell to anchor new downtown building",
				"DEC 12, 2018, 5:10 PM CST Good Harvest Market owner plans condos, stores next to Waukesha building",
				"DEC 11, 2018, 9:18 AM CST Affordable apartments proposed in Waukesha",
				"DEC 6, 2018, 12:27 PM CST Grand Avenue owners have more tenants lined up",
				"DEC 6, 2018, 6:00 AM CST Graef moving HQ offices, 170 jobs to Grand Avenue",
				"DEC 4, 2018, 10:03 AM CST DRS Naval Power project to get $6.4 million from Menomonee Falls",
				"DEC 3, 2018, 7:45 PM CST Leonardo DRS will move to Menomonee Falls from Milwaukee with state help",
				"DEC 3, 2018, 7:00 AM CST New Land Enterprises pitches 89 apartments in Glendale",
				"DEC 3, 2018, 5:00 AM CST Milwaukee to buy land near Komatsu Mining HQ for rail transit station",
				"DEC 2, 2018, 8:00 AM CST Land deals for Amazon.com in Oak Creek were 15 years in the making",
				"NOV 30, 2018, 1:32 PM CST Defense tech company to move headquarters, 600 jobs to Menomonee Falls",
				"NOV 25, 2018, 6:00 PM CST Amazon.com's Oak Creek site gets no bus service, but that could change",
				"NOV 20, 2018, 11:55 AM CST Milwaukee youth music center The New State aims for 2020 opening",
				"NOV 20, 2018, 10:51 AM CST Plan for veteran apartments in contaminated former school in Milwaukee advances",
				"NOV 16, 2018, 10:53 AM CST Construction starts for 225 more apartments in Oak Creek",
				"NOV 16, 2018, 10:36 AM CST Komatsu Mining would pay $1.9 million to buy Port of Milwaukee land for HQ",
				"NOV 15, 2018, 4:02 PM CST A look at Hammes Co.'s new downtown HQ, set for spring completion: Slideshow",
				"NOV 15, 2018, 10:49 AM CST Komatsu Mining sought $70M incentive for Harbor District HQ development",
				"NOV 13, 2018, 10:59 AM CST Suspected Amazon.com development site in Oak Creek sold",
				"NOV 9, 2018, 12:21 PM CST Manufacturer Klein-Dickert plans new Pewaukee building",
				"NOV 9, 2018, 5:00 AM CST UPFRONT Developer Rick Barrett ready to turn the corner on Couture",
				"NOV 8, 2018, 4:00 PM CST How Rick Barrett plans to make the Couture affordable to millennials",
				"NOV 8, 2018, 11:29 AM CST Affordable housing developer in talks to buy First and National site",
				"NOV 7, 2018, 2:19 PM CST Bayshore owners seek city money for redevelopment with more housing",
				"NOV 7, 2018, 10:01 AM CST Downtown office building to be demolished soon for new hotels",
				"NOV 6, 2018, 2:39 PM CST 27th Street's Wildenberg Hotel could be sold for apartment, office development",
				"NOV 5, 2018, 2:50 PM CST Report: Amazon will split HQ2 into two locations",
				"NOV 4, 2018, 6:00 PM CST Ascent engineer sees mass timber gaining momentum, potential to attract suppliers",
				"NOV 4, 2018, 1:00 PM CST COVER STORY Full Q&A with Tim Gokhman: 'Nothing else like it' at the core of New Land's strategy",
				"NOV 4, 2018, 1:00 PM CST New Land aims for active city living in new Urbanite high-rise: Slideshow",
				"NOV 2, 2018, 11:09 AM CDT Couture construction may start soon after 'milestone' federal financing approval",
				"NOV 2, 2018, 5:00 AM CDT COVER STORY Tim Gokhman beams about Milwaukee",
				"NOV 1, 2018, 1:47 PM CDT Wauwatosa proposal calls for hotel or apartments near Mayfair Collection",
				"OCT 30, 2018, 11:04 AM CDT Land sales for Milwaukee Urban Stables, Royal Capital apartments advance",
				"OCT 26, 2018, 2:16 PM CDT Manufacturer's lease fills Pewaukee spec building that opened this summer",
				"OCT 26, 2018, 5:00 AM CDT REAL ESTATE Is Milwaukee's streetcar the engine of new development?",
				"OCT 25, 2018, 6:30 PM CDT Bay View residents get first look at development with 230 apartments",
				"OCT 24, 2018, 11:49 AM CDT Michels could get $6 million in tax credits for harbor district project" };

		for (int i = 0; i < checked.size(); i++) {
			HashSet<String> s1 = new HashSet<String>(
					Arrays.asList(checked.get(i).getText().replaceAll("\\s", " ").replaceAll("^\\s+", "")));
			s1.removeAll(Arrays.asList(list));

			Iterator<String> value = s1.iterator();
			while (value.hasNext()) {
				System.out.println(value.next());
			}

		}
	}
}
