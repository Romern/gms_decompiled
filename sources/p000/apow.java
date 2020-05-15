package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: apow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apow extends aplq {

    /* renamed from: a */
    private final acpl f84766a;

    /* renamed from: b */
    public final acaf f84767b;

    /* renamed from: c */
    private final abzo f84768c;

    /* renamed from: d */
    private final abvx f84769d;

    public apow(Context context, acpl acpl, abzo abzo, acaf acaf, abvx abvx, RequestIndexingCall$Request requestIndexingCall$Request, abyy abyy) {
        super(bqbd.REQUEST_INDEXING, 2, 1, context, requestIndexingCall$Request, abyy);
        this.f84766a = acpl;
        this.f84768c = abzo;
        this.f84767b = acaf;
        this.f84769d = abvx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        String str;
        abvx abvx;
        RequestIndexingCall$Response requestIndexingCall$Response = new RequestIndexingCall$Response();
        RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) this.f84708n;
        String str2 = requestIndexingCall$Request.f107405a;
        String str3 = requestIndexingCall$Request.f107406b;
        long j = requestIndexingCall$Request.f107407c;
        try {
            absd.m48174a("Corpus name", str3, 2048);
            if (j < 0) {
                str = "Negative sequence number";
            } else {
                str = null;
            }
        } catch (IllegalArgumentException e) {
            str = e.getMessage();
        }
        boolean z = true;
        boolean z2 = false;
        if (str == null) {
            abzo abzo = this.f84768c;
            abyy abyy = this.f84709o;
            RequestIndexingCall$Request requestIndexingCall$Request2 = (RequestIndexingCall$Request) this.f84708n;
            for (acak acak : abzo.mo32528a(abyy, new String[]{requestIndexingCall$Request2.f107406b}, false, requestIndexingCall$Request2.f107405a)) {
                abss b = this.f84768c.mo32534b(acak);
                if (b != null) {
                    absr absr = b.f58157b;
                    if (absr == null) {
                        absr = absr.f58134s;
                    }
                    if (abzm.m48653a(absr)) {
                        this.f84766a.mo32990a(new apov(this, bqbd.SCHEDULE_INDEXING, this.f60439j, acak), ((Long) abzt.f58843K.mo58455c()).longValue());
                        z2 = true;
                    }
                }
            }
            if (!z2 || (abvx = this.f84769d) == null) {
                z = z2;
            } else {
                abvx.mo32375b();
            }
        } else {
            absg.m48192b("Bad request indexing args: %s", str);
            z = false;
        }
        requestIndexingCall$Response.f107409b = z;
        requestIndexingCall$Response.f107408a = Status.f30107a;
        return requestIndexingCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) this.f84708n;
        return String.format("%s, package[%s], corpus[%s]", super.mo33000f(), requestIndexingCall$Request.f107405a, requestIndexingCall$Request.f107406b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        RequestIndexingCall$Response requestIndexingCall$Response = new RequestIndexingCall$Response();
        requestIndexingCall$Response.f107408a = status;
        return requestIndexingCall$Response;
    }
}
