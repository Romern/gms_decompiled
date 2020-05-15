package com.google.android.gms.vision.clearcut;

import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VisionClearcutLogger {

    /* renamed from: a */
    public boolean f109686a = true;

    /* renamed from: b */
    private final qws f109687b;

    public VisionClearcutLogger(Context context) {
        this.f109687b = new qws(context, "VISION", null);
    }

    /* renamed from: a */
    public final void mo59735a(btut btut) {
        byte[] k = btut.mo73642k();
        try {
            if (!this.f109686a) {
                bxvd da = btut.f150628c.mo74144da();
                try {
                    da.mo73635b(k, bxus.m123744c());
                    avxz.m79525a("Would have logged:\n%s", da.toString());
                } catch (Exception e) {
                    avxz.m79526a(e, "Parsing error", new Object[0]);
                }
            } else {
                qwo a = this.f109687b.mo24335a(k);
                a.mo24328b(1);
                a.mo24327b();
            }
        } catch (Exception e2) {
            bqye.m113758a(e2);
            avxz.m79526a(e2, "Failed to log", new Object[0]);
        }
    }
}
