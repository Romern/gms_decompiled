package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.FileLocalId;
import com.google.android.gms.drive.internal.model.ParentReference;
import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.drive.internal.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: vkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkt implements vkr {

    /* renamed from: a */
    public final File f49405a;

    /* renamed from: b */
    private final ClientContext f49406b;

    /* renamed from: c */
    private final Set f49407c;

    /* renamed from: d */
    private final String f49408d;

    public vkt(File file, ClientContext clientContext, String str) {
        sdo.m34959a(file);
        this.f49405a = file;
        sdo.m34959a(clientContext);
        this.f49406b = clientContext;
        this.f49408d = str;
        HashSet hashSet = new HashSet();
        List list = file.f30964G;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ParentReference parentReference = (ParentReference) list.get(i);
                hashSet.add(!parentReference.f31034c ? parentReference.f31033b : "root");
            }
        }
        this.f49407c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: A */
    public final boolean mo28539A() {
        return this.f49405a.f31004v.f31017e;
    }

    /* renamed from: B */
    public final boolean mo28540B() {
        return this.f49405a.f31004v.f31014b;
    }

    /* renamed from: C */
    public final String mo28541C() {
        return this.f49405a.f30961D;
    }

    /* renamed from: D */
    public final long mo28542D() {
        return this.f49405a.f30967J;
    }

    /* renamed from: E */
    public final String mo28543E() {
        return this.f49405a.f30980W;
    }

    /* renamed from: F */
    public final String mo28544F() {
        return this.f49405a.f30981X;
    }

    /* renamed from: G */
    public final String mo28545G() {
        return this.f49405a.f30976S;
    }

    /* renamed from: H */
    public final List mo28546H() {
        List list = this.f49405a.f30966I;
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: I */
    public final boolean mo28547I() {
        return this.f49405a.f30985c;
    }

    /* renamed from: J */
    public final Permission mo28548J() {
        return this.f49405a.f30978U;
    }

    /* renamed from: K */
    public final String mo28549K() {
        return this.f49405a.f31001s;
    }

    /* renamed from: L */
    public final String mo28550L() {
        FileLocalId fileLocalId = this.f49405a.f31007y;
        if (fileLocalId != null) {
            return fileLocalId.f31029c;
        }
        return null;
    }

    /* renamed from: M */
    public final String mo28551M() {
        return this.f49405a.f30989g;
    }

    /* renamed from: N */
    public final String mo28552N() {
        FileLocalId fileLocalId = this.f49405a.f31007y;
        if (fileLocalId != null) {
            return fileLocalId.f31030d;
        }
        return null;
    }

    /* renamed from: O */
    public final User mo28553O() {
        return this.f49405a.f30972O;
    }

    /* renamed from: P */
    public final User mo28554P() {
        return this.f49405a.f31005w;
    }

    /* renamed from: Q */
    public final boolean mo28555Q() {
        return this.f49405a.f30982Y;
    }

    /* renamed from: R */
    public final String mo28556R() {
        return this.f49408d;
    }

    /* renamed from: S */
    public final long mo28557S() {
        return this.f49405a.f30979V;
    }

    /* renamed from: T */
    public final String mo28558T() {
        return this.f49405a.f30998p;
    }

    /* renamed from: U */
    public final List mo28559U() {
        List list = this.f49405a.f30999q;
        return list == null ? bngx.m109376e() : list;
    }

    /* renamed from: V */
    public final Boolean mo28560V() {
        if (this.f49405a.f30983a.contains(69)) {
            return Boolean.valueOf(this.f49405a.f30974Q);
        }
        return null;
    }

    /* renamed from: W */
    public final List mo28561W() {
        if (this.f49405a.f30983a.contains(68)) {
            return this.f49405a.f30973P;
        }
        return Collections.emptyList();
    }

    /* renamed from: X */
    public final List mo28562X() {
        List list = this.f49405a.f30965H;
        return list == null ? bngx.m109376e() : list;
    }

    /* renamed from: Y */
    public final boolean mo28563Y() {
        return this.f49405a.f31000r;
    }

    /* renamed from: Z */
    public final String mo28564Z() {
        return this.f49405a.f30968K;
    }

    /* renamed from: a */
    public final boolean mo28565a() {
        return this.f49405a.f31004v.f31015c;
    }

    /* renamed from: aa */
    public final String mo28566aa() {
        return this.f49405a.f30969L;
    }

    /* renamed from: b */
    public final boolean mo28567b() {
        return this.f49405a.f30970M;
    }

    /* renamed from: c */
    public final boolean mo28568c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo28569d() {
        return vkv.m40744a(this.f49406b);
    }

    /* renamed from: e */
    public final Set mo28570e() {
        return this.f49407c;
    }

    /* renamed from: f */
    public final Set mo28571f() {
        List list = this.f49405a.f30986d;
        if (list != null) {
            return Collections.unmodifiableSet(bnpf.m110049a(list));
        }
        return Collections.emptySet();
    }

    /* renamed from: g */
    public final String mo28572g() {
        return this.f49405a.f31002t;
    }

    /* renamed from: h */
    public final String mo28573h() {
        return this.f49405a.f30971N;
    }

    /* renamed from: i */
    public final String mo28574i() {
        return this.f49405a.f30959B;
    }

    /* renamed from: j */
    public final String mo28575j() {
        return this.f49405a.f31006x;
    }

    /* renamed from: k */
    public final String mo28576k() {
        return this.f49405a.f31008z;
    }

    /* renamed from: l */
    public final String mo28577l() {
        return this.f49405a.f30977T;
    }

    /* renamed from: m */
    public final String mo28578m() {
        return this.f49405a.f30991i;
    }

    /* renamed from: n */
    public final boolean mo28579n() {
        return this.f49405a.f31004v.f31016d;
    }

    /* renamed from: o */
    public final String mo28580o() {
        return this.f49405a.f30960C;
    }

    /* renamed from: p */
    public final String mo28581p() {
        return this.f49405a.f30988f;
    }

    /* renamed from: q */
    public final String mo28582q() {
        return this.f49405a.f30958A;
    }

    /* renamed from: r */
    public final boolean mo28583r() {
        return this.f49405a.f30995m;
    }

    /* renamed from: s */
    public final boolean mo28584s() {
        return this.f49405a.f30992j;
    }

    /* renamed from: t */
    public final bngx mo28585t() {
        List list = this.f49405a.f30962E;
        return list == null ? bngx.m109376e() : bngx.m109368a((Collection) list);
    }

    /* renamed from: u */
    public final String mo28586u() {
        return this.f49405a.f30984b;
    }

    /* renamed from: v */
    public final String mo28587v() {
        return this.f49405a.f30990h;
    }

    /* renamed from: w */
    public final boolean mo28588w() {
        return this.f49405a.f30987e;
    }

    /* renamed from: x */
    public final String mo28589x() {
        return this.f49405a.f30993k;
    }

    /* renamed from: y */
    public final String mo28590y() {
        return this.f49405a.f30996n;
    }

    /* renamed from: z */
    public final long mo28591z() {
        return this.f49405a.f30997o;
    }
}
