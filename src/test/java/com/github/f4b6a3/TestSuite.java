package com.github.f4b6a3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.github.f4b6a3.tsid.TsidCreatorStringTest;
import com.github.f4b6a3.tsid.TsidCreatorTest;
import com.github.f4b6a3.tsid.creator.TimeSortableIdCreatorTest;
import com.github.f4b6a3.tsid.timestamp.DefaultTimestampStrategyTest;
import com.github.f4b6a3.tsid.util.TsidTimeUtilTest;
import com.github.f4b6a3.tsid.util.TsidUtilTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TsidCreatorStringTest.class,
	TsidCreatorTest.class,
	TimeSortableIdCreatorTest.class,
	DefaultTimestampStrategyTest.class,
	TsidTimeUtilTest.class,
	TsidUtilTest.class,
})

/**
 * 
 * It bundles all JUnit test cases.
 * 
 * Also see {@link UniquenesTest}. 
 *
 */
public class TestSuite {
}