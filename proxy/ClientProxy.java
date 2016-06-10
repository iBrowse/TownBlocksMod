package com.juraka.TBM.proxy;

import com.juraka.TBM.init.Blocks;
import com.juraka.TBM.init.Items;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders()
	{
		Blocks.registerRenders();
		Items.registerRenders();
	}
	
}
