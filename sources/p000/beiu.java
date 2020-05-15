package p000;

import android.content.IntentFilter;
import android.net.Uri;

/* renamed from: beiu */
final /* synthetic */ class beiu implements bmxj {

    /* renamed from: a */
    private final beja f111606a;

    /* renamed from: b */
    private final Runnable f111607b;

    public beiu(beja beja, Runnable runnable) {
        this.f111606a = beja;
        this.f111607b = runnable;
    }

    public final Object apply(Object obj) {
        beja beja = this.f111606a;
        Runnable runnable = this.f111607b;
        Uri uri = (Uri) obj;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataPath(uri.getPath(), 0);
        intentFilter.addDataAuthority("*", null);
        beja.f111627b.registerReceiver(new beiy(runnable), intentFilter, beja.f111628c, beja.f111629d);
        return null;
    }
}
