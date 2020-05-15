package p000;

import android.content.Context;

/* renamed from: his */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class his {

    /* renamed from: a */
    private final qws f19834a;

    private his(Context context) {
        this.f19834a = new qws(context, "ANDROID_AUTH", null);
    }

    /* renamed from: a */
    public static his m14426a() {
        return new his(rpr.m34216b());
    }

    /* renamed from: a */
    public final void mo12509a(boct boct) {
        this.f19834a.mo24335a(boct.mo73642k()).mo24327b();
    }

    /* renamed from: a */
    public final void mo12510a(bodk bodk) {
        if (((Boolean) hfe.f19644f.mo58455c()).booleanValue()) {
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 10;
            int i = boct.f132610a | 1;
            boct.f132610a = i;
            bodk.getClass();
            boct.f132621l = bodk;
            boct.f132610a = i | 512;
            mo12509a((boct) da.mo74062i());
        }
    }
}
