package com.google.android.gms.smartdevice.setup.p066ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.smartdevice.setup.ui.AppInstallTrackerFragment$2 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInstallTrackerFragment$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ arxa f108196a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppInstallTrackerFragment$2(arxa arxa, String str) {
        super(str);
        this.f108196a = arxa;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && data != null && this.f108196a.f88395b.equals(data.getEncodedSchemeSpecificPart())) {
            this.f108196a.mo48898a();
            this.f108196a.mo48899b();
            this.f108196a.f88394a.mo48896a();
        }
    }
}
