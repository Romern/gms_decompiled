package com.google.android.gms.nearby.sharing.discovery;

import android.bluetooth.le.ScanResult;
import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastInitiation$2 extends aacm {

    /* renamed from: a */
    public final /* synthetic */ ajwo f81068a;

    /* renamed from: b */
    final /* synthetic */ ajjf f81069b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastInitiation$2(ajwo ajwo, Context context, String str, ajjf ajjf) {
        super(context, str);
        this.f81068a = ajwo;
        this.f81069b = ajjf;
    }

    /* renamed from: a */
    public final void mo16719a(int i) {
        this.f81068a.f71437a.submit(new ajwj(this, i));
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        this.f81068a.f71437a.submit(new ajwi(this, this.f81069b, scanResult));
    }
}
