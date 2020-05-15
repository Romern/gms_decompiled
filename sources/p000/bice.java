package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.TimeUnit;

/* renamed from: bice */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bice extends bick {

    /* renamed from: a */
    private final bibx f120193a;

    /* renamed from: b */
    private final bibt f120194b;

    /* renamed from: c */
    private final Context f120195c;

    /* renamed from: d */
    private final ClientContext f120196d;

    /* renamed from: e */
    private final LatLng f120197e;

    /* renamed from: f */
    private final int f120198f;

    /* renamed from: g */
    private final PlacesParams f120199g;

    public bice(bibx bibx, bibt bibt, Context context, ClientContext clientContext, LatLng latLng, int i, PlacesParams placesParams) {
        this.f120193a = bibx;
        this.f120194b = bibt;
        this.f120195c = context;
        this.f120196d = clientContext;
        this.f120198f = i;
        this.f120197e = latLng;
        this.f120199g = placesParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64517a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvtt bvtt = (bvtt) obj;
        bonq a = bick.m101948a(4, bppo.m112155a(i), j, this.f120199g);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
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
        bxvd da = bpow.f138581c.mo74144da();
        if (bvtt != null) {
            i2 = bvtt.f157620a.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpow bpow = (bpow) da.f164949b;
        bpow.f138583a |= 1;
        bpow.f138584b = i2;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bpow bpow2 = (bpow) da.mo74062i();
        bpow2.getClass();
        bppp2.f138643i = bpow2;
        bppp2.f138635a |= 128;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpqk bpqk2 = (bpqk) bxvd2.f164949b;
        bppp bppp3 = (bppp) bxvd3.mo74062i();
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
    public final /* bridge */ /* synthetic */ Object mo64518a() {
        if (TextUtils.isEmpty(this.f120199g.f79574d)) {
            bibx bibx = this.f120193a;
            bvts a = bibr.m101921a(this.f120195c, this.f120197e, this.f120198f, this.f120199g);
            long c = cghh.m145422c();
            if (bibx.f120174g == null) {
                bibx.f120174g = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/EstimatePlacesByLocation", ciie.m150370a(bvts.f157611f), ciie.m150370a(bvtt.f157618b));
            }
            return (bvtt) bibx.f120175a.mo25554a(bibx.f120174g, a, c, TimeUnit.MILLISECONDS);
        }
        Account account = new Account(this.f120199g.f79574d, "com.google");
        ClientContext clientContext = new ClientContext(this.f120196d);
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        bibt bibt = this.f120194b;
        bvts a2 = bibr.m101921a(this.f120195c, this.f120197e, this.f120198f, this.f120199g);
        if (bibt.f120161c == null) {
            bibt.f120161c = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/EstimatePlacesByLocation", ciie.m150370a(bvts.f157611f), ciie.m150370a(bvtt.f157618b));
        }
        return (bvtt) bibt.f120163a.mo25553a(bibt.f120161c, clientContext, a2, 10000, TimeUnit.MILLISECONDS);
    }
}
