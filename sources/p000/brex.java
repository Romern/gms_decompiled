package p000;

import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.mfi.StopEventCallback;

/* renamed from: brex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brex implements StopEventCallback {

    /* renamed from: a */
    final /* synthetic */ Felica f142740a;

    /* renamed from: b */
    final /* synthetic */ brez f142741b;

    /* renamed from: c */
    final /* synthetic */ int f142742c;

    public brex(brez brez, Felica felica, int i) {
        this.f142741b = brez;
        this.f142740a = felica;
        this.f142742c = i;
    }

    public final void onError(int i, String str) {
        try {
            brhb e = this.f142741b.mo69513e();
            e.f142846d = Integer.valueOf(i);
            e.f142847e = str;
            this.f142741b.f142818f.mo69531a(13, e);
        } finally {
            this.f142741b.mo69508b(this.f142740a, this.f142742c);
            this.f142741b.mo69509c();
        }
    }

    public final void onSuccess() {
        this.f142741b.mo69508b(this.f142740a, this.f142742c);
        this.f142741b.mo69509c();
    }
}
