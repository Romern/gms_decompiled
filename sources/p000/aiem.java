package p000;

import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;

/* renamed from: aiem */
public final /* synthetic */ class aiem implements roo {

    /* renamed from: a */
    private final byte[] f68839a;

    /* renamed from: b */
    private final String f68840b;

    /* renamed from: c */
    private final rod f68841c;

    /* renamed from: d */
    private final ConnectionOptions f68842d;

    public aiem(byte[] bArr, String str, rod rod, ConnectionOptions connectionOptions) {
        this.f68839a = bArr;
        this.f68840b = str;
        this.f68841c = rod;
        this.f68842d = connectionOptions;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        byte[] bArr = this.f68839a;
        String str = this.f68840b;
        rod rod = this.f68841c;
        ConnectionOptions connectionOptions = this.f68842d;
        aieh aieh = (aieh) obj;
        aifj aifj = new aifj((aucf) obj2);
        aids aids = new aids(rod);
        aieh.f68831c.add(aids);
        aiig aiig = new aiig();
        aiig.mo37524a(new aiee(aifj));
        aiig.f68914a.f80622h = bArr;
        aiig.mo37526b(str);
        aiig.mo37522a(aids);
        SendConnectionRequestParams sendConnectionRequestParams = aiig.f68914a;
        sendConnectionRequestParams.f80623i = connectionOptions;
        ((aigl) aieh.mo25289B()).mo36596a(sendConnectionRequestParams);
    }
}
