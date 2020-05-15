package p000;

import android.content.Intent;

/* renamed from: sax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sax extends saz {

    /* renamed from: a */
    final /* synthetic */ Intent f43975a;

    /* renamed from: b */
    final /* synthetic */ C1018gh f43976b;

    /* renamed from: c */
    final /* synthetic */ int f43977c;

    public sax(Intent intent, C1018gh ghVar, int i) {
        this.f43975a = intent;
        this.f43976b = ghVar;
        this.f43977c = i;
    }

    /* renamed from: a */
    public final void mo25323a() {
        Intent intent = this.f43975a;
        if (intent != null) {
            this.f43976b.startActivityForResult(intent, this.f43977c);
        }
    }
}
