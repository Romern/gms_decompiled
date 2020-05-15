package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.fitness.data.DataType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ysb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ysb implements ysl {

    /* renamed from: a */
    public static final srn f54526a = zvt.m46581a();

    /* renamed from: b */
    protected final Context f54527b;

    /* renamed from: c */
    public final yss f54528c;

    /* renamed from: i */
    private final ytj f54529i = new ytj();

    protected ysb(Context context, yss yss) {
        bmxy.m108582a(context, "context");
        this.f54527b = context;
        this.f54528c = yss;
        bnic bnic = yte.f54572a;
    }

    /* renamed from: b */
    private static boolean m44689b(String str, String str2) {
        return str2.startsWith(String.valueOf(str).concat("."));
    }

    /* renamed from: c */
    private static boolean m44690c(String str) {
        return str.startsWith("com.google.internal.");
    }

    /* renamed from: a */
    public final Status mo30717a(String str, Iterable iterable, int i) {
        if (i == 2) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String a = yyd.m44986a((caae) it.next());
                if (a != null && !a.equals(str) && !mo30720a(str)) {
                    return f54549f;
                }
            }
        }
        return mo30725b(str, yyd.m44983a(iterable), i);
    }

    /* renamed from: a */
    public void mo30719a(String str, int i) {
        throw null;
    }

    /* renamed from: b */
    public final caah mo30724b(String str) {
        return (caah) ((bnhe) this.f54529i.f54586e.mo30787a()).get(str);
    }

    /* renamed from: b */
    public final Status mo30725b(String str, Iterable iterable, int i) {
        bnhe bnhe;
        ArrayList arrayList;
        String str2;
        String str3;
        ytz ytz;
        String str4 = str;
        int i2 = i;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!mo30723a(str4, ((caah) it.next()).f172336b, i2)) {
                return f54548e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            caah caah = (caah) it2.next();
            String str5 = caah.f172336b;
            if (i2 != 1 && bzzm.m126358b(str5) && !yty.m44829a(this.f54527b, str4) && !bnjd.m109581a(bmyx.m108640a(',').mo66920b().mo66918a((CharSequence) cdyr.f181940a.mo6606a().mo78481g()), str4)) {
                bnsl bnsl = (bnsl) f54526a.mo68387b();
                bnsl.mo68432a("ysb", "b", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Access denied to health data type %s", str5);
                return new Status(5024);
            } else if (bzzn.m126366b(str5)) {
                arrayList2.add(caah);
            } else if (this.f54529i.mo30747a(str5)) {
                arrayList3.add(caah);
            }
        }
        bnia j = bnic.m109500j();
        Context context = this.f54527b;
        bnia j2 = bnic.m109500j();
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            caah caah2 = (caah) arrayList2.get(i3);
            DataType a = ywt.m44952a(caah2.f172336b);
            if (a == null) {
                arrayList = arrayList2;
            } else {
                String str6 = a.f32066c;
                if (str6 == null || (str2 = a.f32067d) == null) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    if (yte.f54572a.contains(caah2.f172336b)) {
                        if (!cdzp.f182096a.mo6606a().mo78623a()) {
                            srn srn = yty.f54628a;
                            try {
                                Bundle bundle = context.getPackageManager().getApplicationInfo(str4, 128).metaData;
                                if (bundle != null) {
                                    str3 = bundle.getString("com.google.gms.fitness.sdk.version");
                                } else {
                                    str3 = null;
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                ((bnsl) yty.f54628a.mo68388c()).mo68420a("Couldn't find package %s in PM.  Assuming uninstalled", str4);
                                str3 = null;
                            }
                            if (str3 == null) {
                                ytz = ytz.f54629a;
                            } else {
                                ytz = ytz.m44831a(str3);
                            }
                            if (ytz.compareTo((ytz) yte.f54575d.mo30787a()) < 0) {
                                str6 = "https://www.googleapis.com/auth/fitness.body.read";
                                str2 = "https://www.googleapis.com/auth/fitness.body.write";
                            }
                        }
                        str6 = "https://www.googleapis.com/auth/fitness.heart_rate.read";
                        str2 = "https://www.googleapis.com/auth/fitness.heart_rate.write";
                    }
                    int i4 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    } else if (i4 == 0) {
                        j2.mo67629b(str6);
                    } else if (i4 == 1) {
                        j2.mo67629b(str2);
                    }
                }
            }
            i3++;
            arrayList2 = arrayList;
        }
        j.mo67752b((Iterable) j2.mo67751a());
        if (i2 != 1) {
            bnhe = (bnhe) yte.f54574c.mo30787a();
        } else {
            bnhe = (bnhe) yte.f54573b.mo30787a();
        }
        bnia j3 = bnic.m109500j();
        int size2 = arrayList3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            String str7 = (String) bnhe.get(((caah) arrayList3.get(i5)).f172336b);
            if (str7 != null) {
                j3.mo67629b(str7);
            }
        }
        j.mo67752b((Iterable) j3.mo67751a());
        Status c = mo30730c(str4, ydl.m43849a(stc.m36281a((Collection) j.mo67751a())));
        if (!c.mo17710c()) {
            bnsl bnsl2 = (bnsl) f54526a.mo68388c();
            bnsl2.mo68432a("ysb", "b", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("Failed to authenticate %s: %s", str4, c);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Status mo30718a(String str, Set set) {
        long j;
        yss yss = this.f54528c;
        ClientContext a = ClientContext.m22584a(yss.f54559a, yss.mo30735a(str), yss.f54560b, str);
        if (a == null || yss.mo30738b(a)) {
            a = new ClientContext();
            a.f30212b = yss.mo30735a(str);
            a.f30215e = str;
            a.f30216f = str;
            Account account = yss.f54560b;
            a.f30214d = account;
            a.f30213c = account;
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Scope scope = (Scope) it.next();
            if (!a.mo17800a(scope) && !a.mo17800a(ydl.m43848a(scope))) {
                a.mo17806d(scope.f30106b);
                z = true;
            }
        }
        try {
            String b = new sie(a, null).mo25586b(this.f54527b);
            yss yss2 = this.f54528c;
            String str2 = a.f30215e;
            long currentTimeMillis = System.currentTimeMillis();
            Long l = (Long) yss2.f54561c.get(str2);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (currentTimeMillis - j > cdzd.f182003a.mo6606a().mo78562ab()) {
                a.mo17798a("com.google.android.gms.fitness.auth.token", b);
                a.mo17798a("com.google.android.gms.fitness.auth.time", String.valueOf(System.currentTimeMillis()));
                a.mo17796a(yss2.f54559a);
            } else {
                yss2.mo30737a(b, a.f30215e);
            }
            return Status.f30107a;
        } catch (UserRecoverableAuthException e) {
            Intent a2 = e.mo7366a();
            if (a2 == null) {
                bnsl bnsl = (bnsl) f54526a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ysb", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("User recoverable auth exception with no intent");
                return f54551h;
            }
            bnsl bnsl2 = (bnsl) f54526a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("ysb", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("User recoverable auth exception");
            return new Status(5000, "Application needs OAuth consent from the user", PendingIntent.getActivity(this.f54527b, 0, a2, 134217728));
        } catch (gid | IOException e2) {
            bnsl bnsl3 = (bnsl) f54526a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("ysb", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Auth related exception");
            if (this.f54528c.mo30738b(a)) {
                this.f54528c.mo30736a(a);
                return f54551h;
            } else if (z) {
                return f54551h;
            } else {
                return Status.f30107a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo30720a(String str) {
        return ((bnic) ysk.f54539a.mo30787a()).contains(str);
    }

    /* renamed from: a */
    public final boolean mo30721a(String str, caah caah) {
        if (((bnic) ysk.f54540b.mo30787a()).contains(caah.f172336b)) {
            if (((bnhe) ysk.f54543e.mo30787a()).get(ysi.m44707a(str, caah.f172336b)) == ysj.SILENTLY_FAIL) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo30722a(String str, String str2) {
        if (bzzn.m126366b(str2)) {
            return false;
        }
        if ((!m44690c(str2) || !((bnic) ysk.f54539a.mo30787a()).contains(str)) && !m44689b(str, str2)) {
            return this.f54529i.mo30747a(str2);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (((p000.bnhe) p000.ysk.f54543e.mo30787a()).get(p000.ysi.m44707a(r3, r4)) != p000.ysj.f54537b) goto L_0x005e;
     */
    /* renamed from: a */
    public final boolean mo30723a(String str, String str2, int i) {
        if (!m44690c(str2)) {
            if (((bnic) ysk.f54540b.mo30787a()).contains(str2)) {
            }
            if (!bzzn.m126366b(str2) && !m44689b(str, str2)) {
                bnic e = ((bnig) this.f54529i.f54585d.mo30787a()).mo67692g(str2);
                if (e.isEmpty()) {
                    return false;
                }
                if (i == 1 || e.contains("*") || e.contains(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return yty.m44829a(this.f54527b, str);
    }

    /* renamed from: b */
    public final List mo30726b(String str, Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            caae caae = (caae) it.next();
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (mo30723a(str, caah.f172336b, 1)) {
                arrayList.add(caae);
            }
        }
        return arrayList;
    }
}
