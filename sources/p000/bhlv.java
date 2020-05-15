package p000;

/* renamed from: bhlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlv extends bhll {

    /* renamed from: a */
    final float f119016a = -1.0f;

    /* renamed from: a */
    public final void mo63935a(bhmf bhmf, float f, float f2) {
        bhmf.mo63987a(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        bhmb bhmb = new bhmb(0.0f, 0.0f, f3, f3);
        bhmb.f119065e = 180.0f;
        bhmb.f119066f = 90.0f;
        bhmf.f119075f.add(bhmb);
        bhmf.mo63989a(new bhme(), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        bhmf.f119071b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        bhmf.f119072c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
