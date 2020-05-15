package p000;

import android.content.Context;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;

/* renamed from: agba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agba extends rjx {

    /* renamed from: a */
    private static final String f65110a = agcc.class.getSimpleName();

    /* renamed from: b */
    private static final rjo f65111b = new rjo("Mdns.API", f65113d, f65112c);

    /* renamed from: c */
    private static final rje f65112c = new rje();

    /* renamed from: d */
    private static final rjl f65113d = new agax();

    public agba(Context context, MdnsOptions mdnsOptions) {
        super(context, f65111b, mdnsOptions, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo35178a(agbb agbb, MdnsSearchOptions mdnsSearchOptions) {
        rod a = mo24714a(agbb, f65110a);
        rob rob = a.f43429b;
        sdo.checkIfNull(rob, "Key must not be null");
        return mo24699a(new agay(a, a, mdnsSearchOptions), new agaz(rob, a));
    }

    /* renamed from: a */
    public final void mo35179a(agbb agbb) {
        rob rob = mo24714a(agbb, f65110a).f43429b;
        sdo.checkIfNull(rob, "key must not be null");
        mo24698a(rob);
    }
}
