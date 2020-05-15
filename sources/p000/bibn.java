package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;

/* renamed from: bibn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibn extends bibp {

    /* renamed from: b */
    private final Context f120144b;

    /* renamed from: c */
    private final ClientContext f120145c;

    /* renamed from: d */
    private final String f120146d;

    /* renamed from: e */
    private final String f120147e;

    /* renamed from: f */
    private final int f120148f;

    /* renamed from: g */
    private final List f120149g;

    /* renamed from: h */
    private final PlacesParams f120150h;

    /* renamed from: i */
    private final sgv f120151i;

    public bibn(sgv sgv, Context context, ClientContext clientContext, String str, String str2, List list, int i, String str3, PlacesParams placesParams) {
        super(str3);
        this.f120151i = sgv;
        this.f120144b = context;
        this.f120145c = clientContext;
        this.f120146d = str;
        this.f120147e = str2;
        this.f120149g = list;
        this.f120148f = i;
        this.f120150h = placesParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        bvlp bvlp = (bvlp) obj;
        bonq a = bibp.m101914a(14, i, j, this.f120150h);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = bprs.f138894c.mo74144da();
        if (bvlp != null) {
            int size = bvlp.f156583b.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = ((bvlo) bvlp.f156583b.get(i2)).f156577a;
                bxvd da2 = bprt.f138898d.mo74144da();
                String a2 = bhqq.m101360a(str);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bprt bprt = (bprt) da2.f164949b;
                a2.getClass();
                bprt.f138900a |= 1;
                bprt.f138901b = a2;
                bxwc bxwc = ((bvlo) bvlp.f156583b.get(i2)).f156578b;
                int size2 = bxwc.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    i3 += ((bvln) bxwc.get(i4)).f156572a.size();
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bprt bprt2 = (bprt) da2.f164949b;
                bprt2.f138900a |= 2;
                bprt2.f138902c = i3;
                bprt bprt3 = (bprt) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bprs bprs = (bprs) da.f164949b;
                bprt3.getClass();
                if (!bprs.f138896a.mo73666a()) {
                    bprs.f138896a = GeneratedMessageLite.m124021a(bprs.f138896a);
                }
                bprs.f138896a.add(bprt3);
                bpov a3 = bhqq.m101347a(bhqq.m101362b(str), str);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bprs bprs2 = (bprs) da.f164949b;
                a3.getClass();
                if (!bprs2.f138897b.mo73666a()) {
                    bprs2.f138897b = GeneratedMessageLite.m124021a(bprs2.f138897b);
                }
                bprs2.f138897b.add(a3);
            }
        }
        bpqk bpqk = ((bonq) bxvd.f164949b).f133837c;
        if (bpqk == null) {
            bpqk = bpqk.f138732w;
        }
        bxvd bxvd2 = (bxvd) bpqk.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bpqk);
        bppp bppp = ((bpqk) bxvd2.f164949b).f138755v;
        if (bppp == null) {
            bppp = bppp.f138633q;
        }
        bxvd bxvd3 = (bxvd) bppp.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) bppp);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bprs bprs3 = (bprs) da.mo74062i();
        bprs3.getClass();
        bppp2.f138649o = bprs3;
        bppp2.f138635a |= 8192;
        bppp bppp3 = (bppp) bxvd3.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpqk bpqk2 = (bpqk) bxvd2.f164949b;
        bppp3.getClass();
        bpqk2.f138755v = bppp3;
        bpqk2.f138734a |= 8388608;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bonq bonq = (bonq) bxvd.f164949b;
        bpqk bpqk3 = (bpqk) bxvd2.mo74062i();
        bonq bonq2 = bonq.f133833p;
        bpqk3.getClass();
        bonq.f133837c = bpqk3;
        bonq.f133835a |= 2;
        return (bonq) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo64507a() {
        if (TextUtils.isEmpty(this.f120150h.f79574d)) {
            return (bvlp) this.f120151i.mo25517a(this.f120153a, bian.m101867a(this.f120144b, this.f120149g, this.f120148f, this.f120150h).serializeToBytes(), bvlp.f156580c, this.f120146d, this.f120147e, cggs.m145360c(), 10276);
        }
        Account account = new Account(this.f120150h.f79574d, "com.google");
        ClientContext clientContext = new ClientContext(this.f120145c);
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        return (bvlp) this.f120151i.mo25515a(clientContext, 1, this.f120153a, bian.m101867a(this.f120144b, this.f120149g, this.f120148f, this.f120150h).serializeToBytes(), bvlp.f156580c, cggs.m145360c(), 10276);
    }
}
