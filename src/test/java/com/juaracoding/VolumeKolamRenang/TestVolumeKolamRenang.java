package com.juaracoding.VolumeKolamRenang;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestVolumeKolamRenang {
	
	volumeKolamRenang volumeKolamRenang;

	@Before
	public void setUp() throws Exception {
		volumeKolamRenang = new volumeKolamRenang();
		
	}

	@Test
	@FileParameters("src/test/resources/volumekolamrenang(1).csv")
	public void testkolamrenang(double p, double l, double t) {
		
		double actual = volumeKolamRenang.volume(p, l, t);
		
		assertEquals(t, actual);
			
	}
	
	@Test
	public void testKelilingKolamRenangBukanAngka() {
		
		String doublebukanAngka = "C";
		double convert = Double.parseDouble(doublebukanAngka);
		
		double actual = volumeKolamRenang.volume(convert);		
		
		String expect = "C";
		
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
	}
	
	@Test
	public void TestKelilingKolamRenangAngkaNegatif() {
		
		double p = -5.5;
		
		double actual = volumeKolamRenang.volume(p);
		
		assertEquals(198, actual, 0.0);
			
	}
	
	@Test
	public void testVolumeKolamRenangAngkaNull() {
		
		double p = 0;
		Double sisiNull = null;
		
		
		double actual = volumeKolamRenang.volume(p);		
		
		assertNull(p);
		assertEquals(0, actual, 0.0);
	}

}
