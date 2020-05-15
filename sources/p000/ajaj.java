package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Message;

/* renamed from: ajaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajaj extends ahgx {
    public ajaj(Context context, String str, String str2) {
        super(context, str, str2);
    }

    /* renamed from: a */
    public static String m58361a(Message message) {
        return aiye.m58198a(ClientAppIdentifier.f80666a, message);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo36458a() {
        return byzr.f169150h;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo36463b(Object obj) {
        byze byze = ((byzr) obj).f169154c;
        if (byze == null) {
            byze = byze.f169064e;
        }
        return m58361a(ajek.m58601a(byze));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo36461a(Object obj) {
        byzr byzr = (byzr) obj;
        return false;
    }
}
