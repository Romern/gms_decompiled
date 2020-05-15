package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.drive.internal.CheckResourceIdsExistRequest;
import com.google.android.gms.drive.internal.OnResourceIdSetResponse;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: ucq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucq extends uch {

    /* renamed from: f */
    private final CheckResourceIdsExistRequest f47252f;

    public ucq(ubk ubk, CheckResourceIdsExistRequest checkResourceIdsExistRequest, uto uto) {
        super("CheckResourceIdsExistOperation", ubk, uto, 1);
        this.f47252f = checkResourceIdsExistRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo27234d(Context context) {
        HashSet hashSet;
        aaal.m21020a(this.f47252f, "checkResourceIds request may not be null.");
        aaal.m21020a(this.f47252f.f30813a, "Invalid checkResourceIds request: no resource ids provided.");
        aaal.m21021a(this.f47252f.f30813a.size() <= 50, "Number of resource ids must be less than or equal to 50");
        ubk ubk = this.f47237a;
        HashSet hashSet2 = new HashSet(this.f47252f.f30813a);
        uhn uhn = ubk.f47144e;
        uey uey = ubk.f47143d;
        sdo.m34959a(uey);
        sdo.m34959a(hashSet2);
        sdo.m34974b(hashSet2.size() <= 50);
        if (hashSet2.isEmpty()) {
            hashSet = new HashSet();
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < hashSet2.size(); i++) {
                arrayList.add("?");
            }
            uig a = ((ugx) uhn).mo27364a(uey, "EntryView", "ScopedEntryView", uoh.m39066a(voz.m40974b(uey.f47394a.f47683b), uoh.m39064a(String.format(Locale.US, "%s IN (%s)", ujr.RESOURCE_ID.f47814c.mo27700a(), TextUtils.join(",", arrayList)), new ArrayList(hashSet2))), (String) null);
            try {
                HashSet hashSet3 = new HashSet();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ujx ujx = (ujx) it.next();
                    if (!ujx.mo27523A()) {
                        hashSet3.add(ujx.mo27616i());
                    }
                }
                a.close();
                hashSet = hashSet3;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        this.f47238b.mo27979a(new OnResourceIdSetResponse(new ArrayList(hashSet)));
    }
}
