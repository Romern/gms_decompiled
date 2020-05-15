package p000;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: val */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class val {

    /* renamed from: d */
    private static final sbw f48848d = new sbw("SyncMoreFactory", "");

    /* renamed from: a */
    public final vpu f48849a;

    /* renamed from: b */
    public final uhn f48850b;

    /* renamed from: c */
    public final uih f48851c;

    /* renamed from: e */
    private final uey f48852e;

    public val(vpu vpu, uey uey) {
        sdo.m34959a(vpu);
        this.f48849a = vpu;
        this.f48850b = vpu.f49757d;
        sdo.m34959a(uey);
        this.f48852e = uey;
        this.f48851c = uey.f47394a;
    }

    /* renamed from: a */
    private static final Date m39878a(Date date, Date date2) {
        if (date != null) {
            return (date2 == null || date.getTime() > date2.getTime()) ? date : date2;
        }
        return date2;
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
    public final Date mo28167a(Query query) {
        Date date;
        Date date2;
        Set a = query.mo18285a();
        sdo.checkIfNull(a, "Query can't have null spaces (have you validated them?)");
        boolean z = true;
        sdo.m34975b(!a.isEmpty(), "Query can't have empty spaces (have you validated them?)");
        boolean contains = a.contains(DriveSpace.f30734a);
        boolean contains2 = a.contains(DriveSpace.f30736c);
        boolean contains3 = a.contains(DriveSpace.f30735b);
        if (!contains3 && !contains && !contains2) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Not querying any space?");
        Date date3 = null;
        if (contains) {
            LogicalFilter logicalFilter = query.f31087a;
            if (logicalFilter == null || !((Boolean) logicalFilter.mo18284a(new vfx())).booleanValue()) {
                List<uli> a2 = this.f48850b.mo27391a(this.f48851c, uzz.DRIVE);
                if (a2.isEmpty()) {
                    date = new Date(Long.MAX_VALUE);
                } else {
                    Date date4 = null;
                    for (uli uli : a2) {
                        Long l = uli.f48119b;
                        date4 = m39878a(date4, l != null ? new Date(l.longValue()) : null);
                    }
                    date = date4;
                }
            } else {
                date = new Date(Long.MAX_VALUE);
            }
        } else {
            date = null;
        }
        if (contains3) {
            Iterator it = this.f48850b.mo27391a(this.f48851c, uzz.APPDATA).iterator();
            while (true) {
                if (!it.hasNext()) {
                    date2 = new Date(Long.MAX_VALUE);
                    break;
                }
                uli uli2 = (uli) it.next();
                if (((uzu) uli2.mo27690b()).f48783a.contains(this.f48852e.f47395b)) {
                    Long l2 = uli2.f48119b;
                    if (l2 != null) {
                        date2 = new Date(l2.longValue());
                    } else {
                        date2 = null;
                    }
                }
            }
            date = m39878a(date, date2);
        }
        if (!contains2) {
            return date;
        }
        uli b = this.f48850b.mo27421b(this.f48851c);
        if (b == null) {
            date3 = new Date(Long.MAX_VALUE);
        } else {
            Long l3 = b.f48119b;
            if (l3 != null) {
                date3 = new Date(l3.longValue());
            }
        }
        return m39878a(date, date3);
    }

    /* renamed from: a */
    public final uzt mo28168a(Query query, Date date) {
        sdo.checkIfNull(query.mo18285a(), "Query can't have null spaces (have you validated them?)");
        sdo.m34975b(!query.mo18285a().isEmpty(), "Query can't have empty spaces (have you validated them?)");
        uzs a = new vfr(this.f48852e.f47395b).mo28403a(query);
        String str = null;
        if (!query.mo18285a().contains(DriveSpace.f30735b)) {
            SortOrder sortOrder = query.f31089c;
            ArrayList arrayList = new ArrayList();
            if (sortOrder != null) {
                if (sortOrder.f31095b) {
                    arrayList.add(vae.f48815j.f48803a);
                }
                if (!sortOrder.f31094a.isEmpty()) {
                    List list = sortOrder.f31094a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        FieldWithSortOrder fieldWithSortOrder = (FieldWithSortOrder) list.get(i);
                        uvy a2 = uyu.m39796a(fieldWithSortOrder.f31101a);
                        if (a2 == null) {
                            f48848d.mo25374b("SyncMoreFactory", "Bad sort order field: %s", fieldWithSortOrder.f31101a);
                        } else {
                            vad vad = uxx.m39710a(a2).f48717c;
                            if (vad != null && vad.f48805c) {
                                String str2 = vad.f48803a;
                                String str3 = !fieldWithSortOrder.f31102b ? " desc" : "";
                                arrayList.add(str3.length() == 0 ? new String(str2) : str2.concat(str3));
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                str = TextUtils.join(",", arrayList);
            }
        }
        return new uzt(uzs.m39852a(Arrays.asList(a, uzs.m39851a(date))), query.mo18285a(), str);
    }
}
