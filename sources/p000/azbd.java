package p000;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.matchstick.call.CallEntryChimeraActivity;

/* renamed from: azbd */
public final /* synthetic */ class azbd implements Runnable {

    /* renamed from: a */
    private final CallEntryChimeraActivity f98892a;

    /* renamed from: b */
    private final Uri f98893b;

    /* renamed from: c */
    private final boolean f98894c;

    /* renamed from: d */
    private final boolean f98895d;

    public azbd(CallEntryChimeraActivity callEntryChimeraActivity, Uri uri, boolean z, boolean z2) {
        this.f98892a = callEntryChimeraActivity;
        this.f98893b = uri;
        this.f98894c = z;
        this.f98895d = z2;
    }

    public final void run() {
        CallEntryChimeraActivity callEntryChimeraActivity = this.f98892a;
        Uri uri = this.f98893b;
        boolean z = this.f98894c;
        azbi.m85190a(callEntryChimeraActivity, new Intent("com.google.android.apps.tachyon.action.CALL").setPackage("com.google.android.apps.tachyon").setData(uri).putExtra(ddr.f12945a, z).putExtra(ddr.f12946b, this.f98895d));
    }
}
