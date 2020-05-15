package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: basl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class basl implements batc {

    /* renamed from: a */
    public final Executor f101660a;

    /* renamed from: b */
    public final Set f101661b = new HashSet();

    /* renamed from: c */
    public final afln f101662c;

    public basl(afln afln, Executor executor) {
        this.f101662c = afln;
        this.f101660a = executor;
    }

    /* renamed from: a */
    public final bqgg mo55936a(batd batd, batf batf) {
        MdhBroadcastListenerParams mdhBroadcastListenerParams;
        Executor executor = this.f101660a;
        afln afln = this.f101662c;
        MdhBroadcastListenerKey a = basi.m87489a(batd);
        if (batf != null) {
            mdhBroadcastListenerParams = new MdhBroadcastListenerParams(basn.m87494a(((batb) batf).f101693a));
        } else {
            mdhBroadcastListenerParams = null;
        }
        afno afno = afln.f64328a;
        roz b = rpa.m34196b();
        b.f43472a = new aflj(a, mdhBroadcastListenerParams);
        b.f43473b = new Feature[]{abpq.f57885c};
        return basw.m87505a(executor, afno.mo24701a(b.mo24977a()));
    }
}
