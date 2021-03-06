package ckathode.weaponmod.entity.scorpioid;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderScorpioid extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			"realmsofchaos:textures/entity/scorpioid.png");

	public RenderScorpioid() {
		super(new ModelScorpioid(), 0.75f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}

	protected void preRenderCallback(EntityLivingBase p_77041_1_,
			float p_77041_2_) {
		float scale = 1.0f;
		GL11.glScalef(scale, scale, scale);
	}
}