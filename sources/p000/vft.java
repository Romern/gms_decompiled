package p000;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: vft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vft implements vgn {

    /* renamed from: a */
    private final uey f49203a;

    /* renamed from: b */
    private final List f49204b;

    public vft(uey uey, List list) {
        this.f49203a = uey;
        this.f49204b = list;
    }

    /* renamed from: b */
    private static uyk m40338b(uvy uvy) {
        uyk a = uxx.m39710a(uvy);
        if (a != null) {
            return a;
        }
        String valueOf = String.valueOf(uvy.mo28084a());
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Field unavailable: ") : "Field unavailable: ".concat(valueOf));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28317a() {
        return m40339b(Operator.f31122a, uzm.f48731G, "owner");
    }

    /* renamed from: b */
    public static final vfv m40339b(Operator operator, uvy uvy, Object obj) {
        uyk b = m40338b(uvy);
        String b2 = b.mo28108b(obj);
        String a = !uvy.equals(uzm.f48726B) ? b.mo28107a(obj) : null;
        if (uvy.equals(vgc.f49218b) && "application/vnd.google-apps.folder".equals(obj)) {
            uog b3 = ukm.MIME_TYPE.f48022aB.mo27708b("application/vnd.google-apps.folder");
            unp unp = ukm.MIME_TYPE.f48022aB;
            unp.mo27709b(2);
            return new vgd(b3, uoh.m39069b(unp.mo27700a(), "application/vnd.google-apps.folder"));
        } else if (Operator.f31122a.equals(operator)) {
            if (!uvy.equals(uzm.f48726B)) {
                return new vgd(uoh.m39062a(b2, a), uoh.m39069b(b2, a));
            }
            String valueOf = String.valueOf(ung.UNTRASHED.f48312d);
            if (obj.equals(true)) {
                return new vgd(uoh.m39069b(b2, valueOf), uoh.m39062a(b2, valueOf));
            }
            return new vgd(uoh.m39061a(b2, 0), uoh.m39068b(b2, 0));
        } else if (Operator.f31123b.equals(operator)) {
            return new vgd(uoh.m39075c(b2, a), uoh.m39081f(b2, a));
        } else {
            if (Operator.f31124c.equals(operator)) {
                return new vgd(uoh.m39077d(b2, a), uoh.m39079e(b2, a));
            }
            if (Operator.f31125d.equals(operator)) {
                return new vgd(uoh.m39079e(b2, a), uoh.m39077d(b2, a));
            }
            if (Operator.f31126e.equals(operator)) {
                return new vgd(uoh.m39081f(b2, a), uoh.m39075c(b2, a));
            }
            if (Operator.f31129h.equals(operator)) {
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
                sb.append("%");
                sb.append(a);
                sb.append("%");
                uog g = uoh.m39082g(b2, sb.toString());
                StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 2);
                sb2.append("%");
                sb2.append(a);
                sb2.append("%");
                return new vgd(g, uoh.m39083h(b2, sb2.toString()));
            }
            String valueOf2 = String.valueOf(operator.f31130i);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unsupported operator: ") : "Unsupported operator: ".concat(valueOf2));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28318a(Operator operator, List list) {
        if (Operator.f31127f.equals(operator)) {
            return new vfw(true, list, false);
        }
        if (Operator.f31128g.equals(operator)) {
            return new vfw(false, list, false);
        }
        String valueOf = String.valueOf(operator.f31130i);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Not implemented logical operation:") : "Not implemented logical operation:".concat(valueOf));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28319a(Operator operator, uvy uvy, Object obj) {
        return m40339b(operator, uvy, obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28320a(Object obj) {
        return ((vfv) obj).mo28405a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28321a(String str) {
        uog uog;
        String str2;
        List list = this.f49204b;
        if (str != null && !TextUtils.isEmpty(str)) {
            unp[] unpArr = {ukm.TITLE.f48022aB, ukm.DESCRIPTION.f48022aB};
            sdo.m34974b(true);
            ArrayList arrayList = new ArrayList();
            Matcher matcher = vgb.f49216a.matcher(str);
            int i = 0;
            while (matcher.find()) {
                if (matcher.group(1) != null) {
                    str2 = matcher.group(1);
                } else if (matcher.group(2) != null) {
                    str2 = matcher.group(2);
                } else {
                    str2 = matcher.group();
                }
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    String replaceAll = str2.replaceAll("\\|", "||").replaceAll("%", "|%").replaceAll("_", "|_");
                    StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 2);
                    sb.append("%");
                    sb.append(replaceAll);
                    sb.append("%");
                    arrayList.add(sb.toString());
                    i++;
                    if (i >= 10) {
                        break;
                    }
                }
            }
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            uog uog2 = null;
            if (!unmodifiableList.isEmpty()) {
                uog uog3 = null;
                for (String str3 : unmodifiableList) {
                    uog uog4 = null;
                    for (int i2 = 0; i2 < 2; i2++) {
                        uog a = uoh.m39063a(unpArr[i2].mo27700a(), "\"|\"", str3);
                        if (uog4 != null) {
                            uog4 = uoh.m39072b(uog4, a);
                        } else {
                            uog4 = a;
                        }
                    }
                    if (uog3 != null) {
                        uog3 = uoh.m39066a(uog3, uog4);
                    } else {
                        uog3 = uog4;
                    }
                }
                uog2 = uog3;
            }
            if (uog2 == null) {
                uog2 = uoh.f48391a;
            }
            if (!list.isEmpty()) {
                uog2 = uoh.m39072b(uog2, vgb.m40377a(list));
            }
            uog = uoh.m39066a(uog2, ukm.TRASHED.f48022aB.mo27711c());
        } else {
            uog = uoh.f48392b;
        }
        String str4 = uog.f48389a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 5);
        sb2.append("NOT(");
        sb2.append(str4);
        sb2.append(")");
        return new vgd(uog, uoh.m39064a(sb2.toString(), uog.f48390b));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28325b() {
        return new vgd(uoh.f48391a, uoh.f48392b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: voz.a(boolean, com.google.android.gms.drive.DriveId):uog
     arg types: [int, com.google.android.gms.drive.DriveId]
     candidates:
      voz.a(long, long):uog
      voz.a(long, com.google.android.gms.drive.auth.AppIdentity):uog
      voz.a(long, java.lang.String):uog
      voz.a(java.lang.String, java.lang.Iterable):uog
      voz.a(boolean, com.google.android.gms.drive.DriveId):uog */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28322a(uvu uvu, Object obj) {
        if (vgc.f49220d.equals(uvu)) {
            DriveId driveId = (DriveId) obj;
            return new vgd(voz.m40972a(false, driveId), voz.m40972a(true, driveId));
        }
        String valueOf = String.valueOf(uvu);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("Unsupported field for contains comparison: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28323a(uvy uvy) {
        String b = m40338b(uvy).mo28108b(null);
        return new vgd(uoh.m39073c(b), uoh.m39067b(b));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: voz.a(boolean, com.google.android.gms.drive.metadata.CustomPropertyKey, uey, java.lang.String):uog
     arg types: [int, com.google.android.gms.drive.metadata.CustomPropertyKey, uey, java.lang.String]
     candidates:
      voz.a(long, java.lang.String, java.lang.String, boolean):uog
      voz.a(boolean, com.google.android.gms.drive.metadata.CustomPropertyKey, uey, java.lang.String):uog */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28324a(uvy uvy, Object obj) {
        if (vgc.f49223g.equals(uvy)) {
            Iterator it = ((AppVisibleCustomProperties) obj).iterator();
            CustomProperty customProperty = (CustomProperty) it.next();
            sdo.m34975b(!it.hasNext(), "value should have only 1 element");
            String str = customProperty.f31069b;
            if (str == null) {
                return new vgd(uoh.f48392b, uoh.f48391a);
            }
            return new vgd(voz.m40973a(false, customProperty.f31068a, this.f49203a, str), voz.m40973a(true, customProperty.f31068a, this.f49203a, customProperty.f31069b));
        }
        String valueOf = String.valueOf(uvy);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Unsupported field for has comparison: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final uog mo28404a(Query query) {
        LogicalFilter logicalFilter = query.f31087a;
        if (logicalFilter != null) {
            return ((vfv) logicalFilter.mo18284a(this)).mo28406b();
        }
        return uoh.f48391a;
    }
}
