package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.StatFs;
import android.util.Log;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: abgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgz {

    /* renamed from: a */
    VolleyError f57455a;

    /* renamed from: b */
    private final Context f57456b;

    /* renamed from: c */
    private final aaxx f57457c;

    /* renamed from: d */
    private final Response.ErrorListener f57458d;

    /* renamed from: e */
    private final StatFs f57459e = new StatFs(this.f57460f);

    /* renamed from: f */
    private final String f57460f;

    /* renamed from: g */
    private final abcr f57461g;

    public abgz(Context context, aaxx aaxx, abcr abcr) {
        this.f57456b = context;
        this.f57460f = context.getCacheDir().getAbsolutePath();
        this.f57457c = aaxx;
        this.f57461g = abcr;
        this.f57455a = null;
        this.f57458d = new abgy(this);
    }

    /* renamed from: b */
    private final long m47710b() {
        this.f57459e.restat(this.f57460f);
        int i = Build.VERSION.SDK_INT;
        return this.f57459e.getFreeBlocksLong() * this.f57459e.getBlockSizeLong();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasm.a(java.lang.String, boolean):aasm
     arg types: [java.lang.String, int]
     candidates:
      aasm.a(java.lang.String, java.lang.String):aasm
      aasm.a(org.json.JSONObject, aasm):aasm
      aasm.a(java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.String
      aasm.a(java.lang.String, boolean):aasm */
    /* renamed from: a */
    public final void mo32093a() {
        String str;
        ArrayList arrayList = new ArrayList();
        String[] a = aayh.m47256a(cefk.f182602a.mo6606a().mo79078a());
        List<PackageInfo> installedPackages = this.f57456b.getPackageManager().getInstalledPackages(0);
        C1223np npVar = new C1223np();
        for (int i = 0; i < installedPackages.size(); i++) {
            PackageInfo packageInfo = installedPackages.get(i);
            npVar.put(packageInfo.packageName, packageInfo.versionName);
        }
        long max = (Math.max(m47710b() - ceeg.m136413r(), 0L) / ceeg.m136414s()) / ceeg.f182447a.mo6606a().mo78986af();
        for (int i2 = 0; i2 < a.length && ((long) arrayList.size()) != max; i2++) {
            if (npVar.containsKey(a[i2])) {
                bxvd da = abep.f57271d.mo74144da();
                String str2 = a[i2];
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abep abep = (abep) da.f164949b;
                str2.getClass();
                abep.f57273a |= 1;
                abep.f57274b = str2;
                String str3 = (String) npVar.get(a[i2]);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abep abep2 = (abep) da.f164949b;
                str3.getClass();
                abep2.f57273a |= 2;
                abep2.f57275c = str3;
                arrayList.add((abep) da.mo74062i());
            }
        }
        abep[] abepArr = (abep[]) arrayList.toArray(new abep[0]);
        if (abepArr.length != 0) {
            try {
                bzqw a2 = abfl.m47617a(this.f57456b, abepArr, this.f57458d, this.f57461g);
                for (int i3 = 0; i3 < a2.f171082a.size(); i3++) {
                    bzqx bzqx = (bzqx) a2.f171082a.get(i3);
                    bzqz bzqz = bzqx.f171085a;
                    if (bzqz == null) {
                        bzqz = bzqz.f171093b;
                    }
                    String str4 = bzqz.f171095a;
                    int i4 = 0;
                    for (bzqv bzqv : bzqx.f171086b) {
                        i4 += bzqv.f171078b.size();
                    }
                    if (m47710b() - ceeg.m136413r() > ((long) i4) * ceeg.m136414s()) {
                        for (bzqv bzqv2 : bzqx.f171086b) {
                            String str5 = bzqv2.f171077a;
                            ArrayList arrayList2 = new ArrayList();
                            for (bzqy bzqy : bzqv2.f171078b) {
                                bzre bzre = bzqy.f171090a;
                                if (bzre == null) {
                                    bzre = bzre.f171108c;
                                }
                                bzrm bzrm = bzqy.f171091b;
                                if (bzrm == null) {
                                    bzrm = bzrm.f171163e;
                                }
                                String str6 = bzre.f171110a;
                                bzrd bzrd = bzre.f171111b;
                                if (bzrd == null) {
                                    bzrd = bzrd.f171102d;
                                }
                                String str7 = bzrd.f171104a;
                                bzrd bzrd2 = bzre.f171111b;
                                if (bzrd2 == null) {
                                    bzrd2 = bzrd.f171102d;
                                }
                                String str8 = bzrd2.f171105b;
                                bzrd bzrd3 = bzre.f171111b;
                                if (bzrd3 == null) {
                                    bzrd3 = bzrd.f171102d;
                                }
                                aasm b = aasm.m46900b(str6, str7, str8, bzrd3.f171106c, bzrm.f171168d);
                                arrayList2.add(b);
                                String d = b.mo31719d();
                                String str9 = bzrm.f171166b;
                                bzrl bzrl = bzrm.f171167c;
                                if (bzrl == null) {
                                    bzrl = bzrl.f171159b;
                                }
                                this.f57457c.mo31887a(aasm.m46886a(d, str9, bzrl.f171161a, bzrm.f171165a, bzrm.f171168d), str4);
                            }
                            aaxx aaxx = this.f57457c;
                            aasm a3 = aasm.m46890a(str5, false);
                            C1223np npVar2 = new C1223np();
                            npVar2.put(a3.f56492b, a3);
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                aasm aasm = (aasm) arrayList2.get(i5);
                                a3.mo31716a(aasm);
                                npVar2.put(aasm.f56492b, aasm);
                            }
                            aaxx.mo31888a(new abey(a3.f56492b, npVar2, MfiClientException.TYPE_MFICLIENT_NOT_STARTED), str4);
                        }
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                VolleyError volleyError = this.f57455a;
                if (volleyError != null) {
                    str = volleyError.toString();
                } else {
                    str = "Timeout Error.";
                }
                String valueOf = String.valueOf(str);
                Log.e("gH_GetOffHelpContTask", valueOf.length() == 0 ? new String("Error while making network request.\n") : "Error while making network request.\n".concat(valueOf), e);
                VolleyError volleyError2 = this.f57455a;
                if (volleyError2 != null) {
                    throw volleyError2;
                }
                throw new TimeoutException();
            }
        }
    }
}
