package p000;

import android.database.CursorWindow;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import com.google.android.gms.drive.realtime.internal.event.FieldChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ObjectChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
import com.google.android.gms.drive.realtime.internal.event.ReferenceShiftedDetails;
import com.google.android.gms.drive.realtime.internal.event.TextDeletedDetails;
import com.google.android.gms.drive.realtime.internal.event.TextInsertedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValueChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesSetDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: vha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vha {

    /* renamed from: a */
    private static final String f49241a = bksz.m106579a(bksz.f125255a);

    /* renamed from: b */
    private final List f49242b = new ArrayList();

    /* renamed from: c */
    private final List f49243c = new ArrayList();

    /* renamed from: d */
    private final bkqk f49244d;

    /* renamed from: e */
    private ParcelableChangeInfo f49245e;

    /* renamed from: f */
    private boolean f49246f;

    /* renamed from: g */
    private boolean f49247g = false;

    /* renamed from: h */
    private vkb f49248h = null;

    public vha(bkqk bkqk) {
        this.f49244d = bkqk;
    }

    /* renamed from: a */
    private static int m40415a(vkb vkb, Object obj) {
        int i = vkb.f49387b;
        vkb.mo28513a(obj);
        return i;
    }

    /* renamed from: a */
    private static int m40416a(vkb vkb, List list) {
        int i = vkb.f49387b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vkb.mo28513a((blhp) it.next());
        }
        return i;
    }

    /* renamed from: a */
    private final ParcelableEvent m40417a(bkrn bkrn) {
        String str;
        int i;
        String str2;
        int i2;
        bkrn bkrn2 = bkrn;
        if (this.f49248h == null) {
            this.f49248h = new vkb(new vjc(this.f49244d));
        }
        bkqw bkqw = bkrn2.f125157b;
        String str3 = bkqw.f125130a;
        List list = bkrn2.f125158c;
        boolean a = bkqw.mo66269a();
        int i3 = bkrn2.f125157b.f125131b;
        boolean z = (i3 & 4) != 0;
        boolean z2 = (i3 & 8) != 0;
        bkqo bkqo = bkrn2.f125156a;
        String d = bkqo.mo66247d();
        if (bkrn2 instanceof bkrr) {
            bkrr bkrr = (bkrr) bkrn2;
            return new ParcelableEvent(str3, "", list, a, z, z2, d, "EditableString", new TextInsertedDetails(bkrr.f125167d, m40415a(this.f49248h, bkrr.f125168e)), null, null, null, null, null, null, null, null);
        } else if (bkrn2 instanceof bkrq) {
            bkrq bkrq = (bkrq) bkrn2;
            return new ParcelableEvent(str3, "", list, a, z, z2, d, "EditableString", null, new TextDeletedDetails(bkrq.f125165d, m40415a(this.f49248h, bkrq.f125166e)), null, null, null, null, null, null, null);
        } else if (bkrn2 instanceof bkrt) {
            bkrt bkrt = (bkrt) bkrn2;
            int a2 = m40416a(this.f49248h, bkrt.f125173e);
            bkqm bkqm = bkrt.f125174f;
            if (bkqm != null) {
                str2 = bkqm.mo66247d();
            } else {
                str2 = null;
            }
            int i4 = bkrt.f125172d;
            int size = bkrt.f125173e.size();
            Integer num = bkrt.f125175g;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            return new ParcelableEvent(str3, "", list, a, z, z2, d, "EditableString", null, null, new ValuesAddedDetails(i4, a2, size, str2, i2), null, null, null, null, null, null);
        } else if (bkrn2 instanceof bkru) {
            bkru bkru = (bkru) bkrn2;
            int a3 = m40416a(this.f49248h, bkru.f125177e);
            bkqm bkqm2 = bkru.f125178f;
            if (bkqm2 != null) {
                str = bkqm2.mo66247d();
            } else {
                str = null;
            }
            int i5 = bkru.f125176d;
            int size2 = bkru.f125177e.size();
            Integer num2 = bkru.f125179g;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = -1;
            }
            return new ParcelableEvent(str3, "", list, a, z, z2, d, "EditableString", null, null, null, new ValuesRemovedDetails(i5, a3, size2, str, i), null, null, null, null, null);
        } else if (bkrn2 instanceof bkrv) {
            bkrv bkrv = (bkrv) bkrn2;
            int a4 = m40416a(this.f49248h, bkrv.f125182f);
            m40416a(this.f49248h, bkrv.f125181e);
            return new ParcelableEvent(str3, "", list, a, z, z2, d, "EditableString", null, null, null, null, new ValuesSetDetails(bkrv.f125180d, a4, bkrv.f125182f.size()), null, null, null, null);
        } else if (bkrn2 instanceof bkrs) {
            bkrs bkrs = (bkrs) bkrn2;
            int a5 = m40415a(this.f49248h, bkrs.f125169d);
            m40415a(this.f49248h, bkrs.f125170e);
            m40415a(this.f49248h, bkrs.f125171f);
            String f = bkrn2.f125156a.mo66249f();
            if (f.equals(f49241a)) {
                return new ParcelableEvent(str3, "", list, a, z, z2, d, "Map", null, null, null, null, null, new ValueChangedDetails(a5), null, null, null);
            }
            return new ParcelableEvent(str3, "", list, a, z, z2, d, f, null, null, null, null, null, null, null, null, new FieldChangedDetails(a5));
        } else if (bkrn2 instanceof bkrp) {
            bkrp bkrp = (bkrp) bkrn2;
            return new ParcelableEvent(str3, "", list, a, z, z2, d, "IndexReference", null, null, null, null, null, null, new ReferenceShiftedDetails(bkrp.f125164g, bkrp.f125161d, bkrp.f125163f, bkrp.f125162e), null, null);
        } else if (!(bkrn2 instanceof bkro)) {
            return new ParcelableEvent(str3, "", list, a, z, z2, d, bkqo.mo66249f(), null, null, null, null, null, null, null, null, null);
        } else {
            List<bkqo> list2 = ((bkro) bkrn2).f125160e;
            int i6 = this.f49248h.f49387b;
            for (bkqo bkqo2 : list2) {
                m40415a(this.f49248h, bkqo2.mo66247d());
            }
            return new ParcelableEvent(str3, "", list, a, z, z2, d, "IndexReference", null, null, null, null, null, null, null, new ObjectChangedDetails(i6, list2.size()), null);
        }
    }

    /* renamed from: a */
    public final ParcelableEventList mo28440a() {
        DataHolder dataHolder;
        this.f49247g = true;
        vkb vkb = this.f49248h;
        if (vkb != null) {
            vkc vkc = vkb.f49388c;
            List list = vkb.f49386a;
            dataHolder = vkc.mo28515a((CursorWindow[]) list.toArray(new CursorWindow[list.size()]));
        } else {
            dataHolder = null;
        }
        return new ParcelableEventList(this.f49242b, dataHolder, this.f49246f, this.f49243c, this.f49245e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vha.a(bkqi, boolean):void
     arg types: [bkqi, int]
     candidates:
      vha.a(vkb, java.lang.Object):int
      vha.a(vkb, java.util.List):int
      vha.a(bkqi, boolean):void */
    /* renamed from: a */
    public final void mo28441a(bkqi bkqi) {
        mo28442a(bkqi, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo28442a(bkqi bkqi, boolean z) {
        boolean z2 = true;
        sdo.m34971a(!this.f49247g, (Object) "build() has already been called");
        List<bkrn> list = bkqi.f125114b;
        Collection<bkrn> collection = bkqi.f125115c;
        for (bkrn bkrn : list) {
            this.f49242b.add(m40417a(bkrn));
        }
        for (bkrn bkrn2 : collection) {
            this.f49242b.add(m40417a(bkrn2));
        }
        if (z) {
            for (bkqo bkqo : bkqi.f125116d) {
                this.f49243c.add(bkqo.mo66247d());
            }
        }
        if (bkqi.f125120h != null) {
            if (this.f49245e != null) {
                z2 = false;
            }
            sdo.m34971a(z2, (Object) "Cannot overwrite non-null previous change.");
            ArrayList arrayList = new ArrayList();
            for (bkrn bkrn3 : bkqi.f125120h.f125122b) {
                arrayList.add(m40417a(bkrn3));
            }
            this.f49245e = new ParcelableChangeInfo(bkqi.f125120h.f125121a, arrayList);
        }
        this.f49246f = bkqi.f125117e.f125150c.contains(bkqz.UNDO_REDO_STATE_CHANGED) | this.f49246f;
    }
}
