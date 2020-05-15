package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: alxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alxh extends alln implements alzw, alwi {

    /* renamed from: A */
    private final WeakReference f74497A;

    /* renamed from: B */
    private rle f74498B;

    /* renamed from: C */
    private Status f74499C;

    /* renamed from: D */
    private boolean f74500D;

    /* renamed from: E */
    private boolean f74501E;

    /* renamed from: F */
    private Status f74502F;

    /* renamed from: a */
    public final alwc f74503a;

    /* renamed from: b */
    public final Object[] f74504b;

    /* renamed from: c */
    public final Set f74505c = new HashSet();

    /* renamed from: m */
    public Context f74506m;

    /* renamed from: n */
    public ArrayList f74507n;

    /* renamed from: o */
    public DataHolder f74508o;

    /* renamed from: p */
    public DataHolder f74509p;

    /* renamed from: q */
    public DataHolder f74510q;

    /* renamed from: r */
    public DataHolder f74511r;

    /* renamed from: s */
    public DataHolder f74512s;

    /* renamed from: t */
    public DataHolder f74513t;

    /* renamed from: u */
    public DataHolder f74514u;

    /* renamed from: v */
    public DataHolder f74515v;

    /* renamed from: w */
    public DataHolder f74516w;

    /* renamed from: x */
    public alvq[] f74517x;

    /* renamed from: y */
    private final alvn f74518y;

    /* renamed from: z */
    private final String[] f74519z;

    public alxh(rkb rkb, alvn alvn, alwc alwc, String[] strArr) {
        super(rkb);
        int i = 0;
        this.f74500D = false;
        this.f74501E = false;
        this.f74497A = new WeakReference(rkb);
        this.f74518y = alvn;
        this.f74503a = alwc;
        this.f74498B = this;
        this.f74519z = strArr;
        this.f74504b = new Object[strArr.length];
        while (true) {
            Object[] objArr = this.f74504b;
            if (i < objArr.length) {
                objArr[i] = new Object();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m62071a(DataHolder dataHolder) {
        Set<String> set;
        int length = this.f74519z.length;
        Set[] setArr = new Set[length];
        for (int i = 0; i < length; i++) {
            HashSet hashSet = new HashSet();
            setArr[i] = hashSet;
            hashSet.add(this.f74519z[i]);
        }
        if (dataHolder != null) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < dataHolder.f30168h; i2++) {
                int a = dataHolder.mo17762a(i2);
                String c = dataHolder.mo17769c("gaia_id", i2, a);
                String c2 = dataHolder.mo17769c("contact_id", i2, a);
                Set set2 = (Set) hashMap.get(c);
                if (set2 == null) {
                    set2 = new HashSet();
                    hashMap.put(c, set2);
                }
                set2.add(c2);
            }
            for (int i3 = 0; i3 < length; i3++) {
                if (ancm.m64021j(this.f74519z[i3]) && (set = (Set) hashMap.get(ancm.m64016e(this.f74519z[i3]))) != null) {
                    for (String str : set) {
                        setArr[i3].add(alwy.m62044g(str));
                    }
                }
            }
        }
        new Thread(new alwk(this, this.f74506m, this.f74518y.f74393a.f74385a, setArr)).start();
    }

    /* renamed from: d */
    private final void m62072d() {
        Status status;
        boolean z;
        rkl rkl;
        if (this.f74498B != null) {
            alvn alvn = this.f74518y;
            if (alvn.f74396d && this.f74502F == null) {
                status = new Status(100);
            } else {
                boolean z2 = alvn.f74395c;
                if (!alvn.f74394b) {
                    status = Status.f30107a;
                } else {
                    status = !this.f74500D ? new Status(100) : this.f74499C;
                }
            }
            boolean z3 = true;
            if (status.f30115i != 100) {
                z = true;
            } else {
                z = false;
            }
            if (this.f74502F == null) {
                z3 = false;
            }
            rle rle = this.f74498B;
            rkb rkb = (rkb) this.f74497A.get();
            alxe alxe = null;
            if (!z && rkb != null) {
                alxe = new alxe(allr.f73629a, rkb);
                try {
                    rkb.mo24795b(alxe);
                } catch (IllegalStateException e) {
                    Log.e("PeopleClient", "Client disconnected unexpectedly!", e);
                }
            }
            this.f74498B = alxe;
            alxf alxf = new alxf(this, alxe);
            rle rle2 = this.f74498B;
            if (!(rle2 == null || (rkl = this.f74518y.f74397e) == null)) {
                rle2.mo9458a(rkl);
            }
            rle.mo17716a((rkk) new alxg(status, alxf, z, z3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return alxo.m62096a(status);
    }

    /* renamed from: a */
    public final synchronized void mo40839a(int i, Bundle bundle) {
        try {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f74499C = new Status(i);
            this.f74507n = bundle.getParcelableArrayList("get.server_blob");
            this.f74500D = bundle.getBoolean("response_complete");
            DataHolder dataHolder = (DataHolder) bundle.getParcelable("gaia_map");
            boolean z = true;
            if (dataHolder != null) {
                if (this.f74518y.f74396d) {
                    if (!this.f74501E) {
                        this.f74501E = true;
                        m62071a(dataHolder);
                    }
                }
                this.f74505c.add(dataHolder);
            }
            Bundle bundle2 = bundle.getBundle("db");
            if (bundle2 != null) {
                for (String str : bundle2.keySet()) {
                    this.f74505c.add((DataHolder) bundle2.getParcelable(str));
                }
                this.f74508o = (DataHolder) bundle2.getParcelable("people");
                this.f74509p = (DataHolder) bundle2.getParcelable("people_address");
                this.f74510q = (DataHolder) bundle2.getParcelable("people_email");
                this.f74511r = (DataHolder) bundle2.getParcelable("people_phone");
                this.f74512s = (DataHolder) bundle2.getParcelable("owner");
                this.f74513t = (DataHolder) bundle2.getParcelable("owner_address");
                this.f74514u = (DataHolder) bundle2.getParcelable("owner_email");
                this.f74515v = (DataHolder) bundle2.getParcelable("owner_phone");
                this.f74516w = (DataHolder) bundle2.getParcelable("circles");
            }
            ArrayList arrayList = this.f74507n;
            if (arrayList != null) {
                if (this.f74504b.length != arrayList.size()) {
                    z = false;
                }
                sdo.m34970a(z);
            }
            m62072d();
        } catch (Exception e) {
            Log.w("PeopleClient", "GetById callback error.", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final synchronized void mo40833a(Status status, alvq[] alvqArr) {
        boolean z;
        try {
            this.f74502F = status;
            this.f74517x = alvqArr;
            if (alvqArr != null) {
                if (this.f74504b.length == alvqArr.length) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34970a(z);
            }
            m62072d();
        } catch (Exception e) {
            Log.w("PeopleClient", "GetById CP2 callback error.", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        amaz amaz = (amaz) rjd;
        this.f74506m = amaz.f43948r;
        alvn alvn = this.f74518y;
        if (alvn.f74393a.f74385a != null) {
            amaz.mo41081a(this, alvn, this.f74519z);
            return;
        }
        this.f74500D = true;
        if (!alvn.f74394b) {
            boolean z = alvn.f74395c;
            this.f74499C = Status.f30107a;
        } else {
            this.f74499C = Status.f30109c;
        }
        m62071a((DataHolder) null);
    }
}
