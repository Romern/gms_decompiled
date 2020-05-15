package p000;

import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import java.util.UUID;

/* renamed from: tah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tah extends tdl {

    /* renamed from: a */
    final /* synthetic */ String f45549a;

    /* renamed from: b */
    final /* synthetic */ UUID f45550b;

    /* renamed from: c */
    final /* synthetic */ String f45551c;

    /* renamed from: d */
    final /* synthetic */ tam f45552d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tah(tam tam, Handler handler, String str, UUID uuid, String str2) {
        super(handler);
        this.f45552d = tam;
        this.f45549a = str;
        this.f45550b = uuid;
        this.f45551c = str2;
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        if (!TextUtils.isEmpty(this.f45551c)) {
            tam tam = this.f45552d;
            Logger Logger = tam.f45571a;
            tam.f45572b.mo17983b(this.f45551c);
        }
        tam tam2 = this.f45552d;
        Logger logger2 = tam.f45571a;
        tam2.f45573c.mo26404a(this.f45550b, 10, tdw);
        tam.f45571a.mo25417e("Couldn't sync with the server due to ", tdw, new Object[0]);
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        if (!TextUtils.isEmpty(this.f45549a)) {
            tam tam = this.f45552d;
            Logger Logger = tam.f45571a;
            tam.f45572b.mo17983b(this.f45549a);
        }
        tam tam2 = this.f45552d;
        Logger logger2 = tam.f45571a;
        tam2.f45573c.mo26405a(this.f45550b, 10, z);
        tam.f45571a.mo25414c("Successfully completed sync", new Object[0]);
    }
}
