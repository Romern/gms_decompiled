package p000;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: voz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class voz {
    /* renamed from: a */
    public static uog m40959a() {
        String a = ujs.f47815a.f48341a.mo27700a();
        String a2 = ulp.REQUIRED_ENTRY_ID.f48147h.mo27700a();
        String b = ulq.f48148a.mo27735b();
        String a3 = ulp.REQUIRED_ENTRY_ID.f48147h.mo27700a();
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a2).length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + String.valueOf(b).length() + String.valueOf(a3).length());
        sb.append(a);
        sb.append(" NOT IN (SELECT ");
        sb.append(a2);
        sb.append(" FROM ");
        sb.append(b);
        sb.append(" WHERE ");
        sb.append(a3);
        sb.append(" IS NOT NULL)");
        return uoh.m39060a(sb.toString());
    }

    /* renamed from: b */
    public static uog m40974b(long j) {
        return ujr.ACCOUNT_ID.f47814c.mo27717e(j);
    }

    /* renamed from: a */
    public static uog m40960a(long j) {
        uog e = ulg.CHILD_ENTRY_ID.f48115c.mo27717e(j);
        return uoh.m39064a(String.format(Locale.US, "%s IN (SELECT %s FROM %s WHERE %s)", ukm.ENTRY_ID.f48022aB.mo27700a(), ulg.PARENT_ENTRY_ID.f48115c.mo27700a(), ulh.f48116a.mo27735b(), e.f48389a), e.f48390b);
    }

    /* renamed from: a */
    public static uog m40961a(long j, long j2) {
        return uoh.m39066a(m40974b(j), ujs.f47815a.f48341a.mo27717e(j2));
    }

    /* renamed from: a */
    public static uog m40962a(long j, AppIdentity appIdentity) {
        return uoh.m39066a(cdqd.m134662b() ? ujn.ACCOUNT_ID.f47806h.mo27717e(j) : m40974b(j), uip.PACKAGE_NAME.f47723j.mo27708b(appIdentity.f30764b), uip.CERTIFICATE_HASH.f47723j.mo27708b(appIdentity.f30765c));
    }

    /* renamed from: a */
    public static uog m40963a(long j, String str) {
        sdo.m34959a((Object) str);
        return uoh.m39066a(m40974b(j), ujr.RESOURCE_ID.f47814c.mo27708b(str));
    }

    /* renamed from: a */
    public static uog m40964a(long j, String str, String str2, boolean z) {
        return uoh.m39066a(m40974b(j), !z ? ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27716e() : ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27714d(), ukm.UNIQUE_IDENTIFIER.f48022aB.mo27708b(str), ukm.SINGLETON_CREATOR_SDK_APP_ID.f48022aB.mo27708b(str2));
    }

    /* renamed from: a */
    public static uog m40965a(long j, ukk ukk, int i) {
        uog[] uogArr = new uog[3];
        uogArr[0] = umu.ANDROID_APP_ID.f48266i.mo27717e(j);
        uogArr[1] = umu.EVENT_TYPE.f48266i.mo27717e((long) i);
        uogArr[2] = ukk != null ? umu.ENTRY_ID.f48266i.mo27717e(ukk.f47941a) : umu.ENTRY_ID.f48266i.mo27716e();
        return uoh.m39066a(uogArr);
    }

    /* renamed from: a */
    private static uog m40966a(DriveSpace driveSpace) {
        if (DriveSpace.f30734a.equals(driveSpace)) {
            return ukm.IN_DRIVE_SPACE.f48022aB.mo27719f();
        }
        if (DriveSpace.f30735b.equals(driveSpace)) {
            return ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27714d();
        }
        if (DriveSpace.f30736c.equals(driveSpace)) {
            return ukm.IN_PHOTOS_SPACE.f48022aB.mo27719f();
        }
        String valueOf = String.valueOf(driveSpace);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unrecognized space: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static uog m40967a(String str, Iterable iterable) {
        return uoh.m39060a(String.format(Locale.US, "%s IN (\"%s\")", str, TextUtils.join("\",\"", iterable)));
    }

    /* renamed from: a */
    public static uog m40968a(List list, String str, boolean z) {
        uog uog;
        if (list.size() == 1) {
            uog = ujg.ENTRY_ID.f47770h.mo27717e(((Long) list.get(0)).longValue());
        } else {
            uog = m40967a(ujg.ENTRY_ID.f47770h.mo27700a(), list);
        }
        if (!z) {
            uog = uoh.m39066a(uog, ujg.VALUE.f47770h.mo27714d());
        }
        if (str == null) {
            return uog;
        }
        return uoh.m39066a(uog, uoh.m39072b(ujg.SDK_APP_ID.f47770h.mo27708b(str), ujg.SDK_APP_ID.f47770h.mo27716e()));
    }

    /* renamed from: a */
    public static uog m40969a(Set set) {
        sdo.m34966a(set, "Spaces must not be null");
        sdo.m34975b(!set.isEmpty(), "Set of spaces must be non-empty");
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(m40966a((DriveSpace) it.next()));
        }
        return uoh.m39071b(arrayList);
    }

    /* renamed from: a */
    public static uog m40970a(uey uey) {
        if (uey.mo27263a()) {
            return uoh.f48391a;
        }
        Set set = uey.f47398e;
        ArrayList arrayList = new ArrayList();
        if (uey.mo27266c()) {
            arrayList.add(m40966a(DriveSpace.f30734a));
        }
        if (uey.mo27267d()) {
            arrayList.add(uoh.m39066a(m40966a(DriveSpace.f30734a), uka.SDK_APP_ID.f47838c.mo27708b(uey.f47395b)));
        }
        if (set.contains(twt.f46773b)) {
            arrayList.add(ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27708b(uey.f47395b));
        }
        if (uey.mo27265b()) {
            arrayList.add(m40966a(DriveSpace.f30736c));
        }
        return uoh.m39071b(arrayList);
    }

    /* renamed from: a */
    public static uog m40971a(unp unp, long j, long j2) {
        return uoh.m39066a(unp.mo27714d(), uoh.m39072b(unp.mo27703a(j), unp.mo27715d(j2)));
    }

    /* renamed from: a */
    public static uog m40972a(boolean z, DriveId driveId) {
        uog uog;
        String str;
        if (driveId.f30728a == null) {
            uog = ujs.f47815a.f48341a.mo27717e(driveId.f30729b);
        } else {
            uog = ujr.RESOURCE_ID.f47814c.mo27708b(driveId.f30728a);
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = ukm.ENTRY_ID.f48022aB.mo27700a();
        if (!z) {
            str = "";
        } else {
            str = "NOT";
        }
        objArr[1] = str;
        objArr[2] = ulg.CHILD_ENTRY_ID.f48115c.mo27700a();
        objArr[3] = "ParentDriveIdView";
        objArr[4] = uog.f48389a;
        return uoh.m39064a(String.format(locale, "%s %s IN (SELECT %s FROM %s WHERE %s)", objArr), uog.f48390b);
    }

    /* renamed from: a */
    public static uog m40973a(boolean z, CustomPropertyKey customPropertyKey, uey uey, String str) {
        String str2;
        if (str == null) {
            return uoh.f48392b;
        }
        uog a = uoh.m39066a(ujg.NAME.f47770h.mo27708b(customPropertyKey.f31064a), ujg.VALUE.f47770h.mo27708b(str));
        if (customPropertyKey.f31065b == 1 && !uey.mo27263a()) {
            a = uoh.m39066a(a, ujg.SDK_APP_ID.f47770h.mo27708b(uey.f47395b));
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = ukm.ENTRY_ID.f48022aB.mo27700a();
        if (!z) {
            str2 = "";
        } else {
            str2 = "NOT";
        }
        objArr[1] = str2;
        objArr[2] = ujg.ENTRY_ID.f47770h.mo27700a();
        objArr[3] = ujh.f47771a.mo27735b();
        objArr[4] = a.f48389a;
        return uoh.m39064a(String.format(locale, "%s %s IN (SELECT %s FROM %s WHERE %s)", objArr), a.f48390b);
    }
}
