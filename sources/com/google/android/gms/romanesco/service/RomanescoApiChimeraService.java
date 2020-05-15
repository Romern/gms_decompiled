package com.google.android.gms.romanesco.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RomanescoApiChimeraService extends zzx {

    /* renamed from: a */
    private static final bnic f107312a = bnic.m109491a("android.permission-group.CONTACTS", "android.permission-group.PHONE", "android.permission-group.SMS");

    /* JADX WARNING: Illegal instructions before constructor call */
    public RomanescoApiChimeraService() {
        super(r2, r0, r4, 1, 9, (int) cgjy.f187097a.mo6606a().mo83926D(), null);
        bnic bnic;
        int[] iArr = {135};
        String[] strArr = {"com.google.android.gms.romanesco.service.START"};
        if (cgjy.f187097a.mo6606a().mo83934L()) {
            bnic = f107312a;
        } else {
            bnic = sft.m35178d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        aoyk aoyk = null;
        if (cgjy.f187097a.mo6606a().mo83948l()) {
            aoyk = aoyk.m69838a(getApplicationContext(), null);
        }
        if (cgjy.f187097a.mo6606a().mo83949m()) {
            int a = C1145kt.m18542a(getApplicationContext(), "android.permission.READ_CONTACTS", str);
            int a2 = C1145kt.m18542a(getApplicationContext(), "android.permission.WRITE_CONTACTS", str);
            if (!(a == 0 && a2 == 0)) {
                aaac.mo16650a(16, new Bundle());
                if (aoyk != null) {
                    ((beon) aoyk.f83847a.f83832e.mo6606a()).mo60861b(new Object[0]);
                    return;
                }
                return;
            }
        }
        if (!cgjy.f187097a.mo6606a().mo83950n() || cgjy.f187097a.mo6606a().mo83940d().f165797a.contains(str)) {
            aaac.mo16652a(new apes(this, aaag.m21013a()));
            return;
        }
        aaac.mo16650a(16, new Bundle());
        if (aoyk != null) {
            ((beon) aoyk.f83847a.f83833f.mo6606a()).mo60861b(new Object[0]);
        }
    }
}
