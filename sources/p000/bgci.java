package p000;

import android.content.Context;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.NanoAppFilter;
import android.net.Uri;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgci {

    /* renamed from: a */
    public final Context f116043a;

    /* renamed from: b */
    public final beeu f116044b;

    /* renamed from: c */
    public final bugn f116045c;

    /* renamed from: d */
    public final bugm f116046d;

    /* renamed from: e */
    public final bgbq f116047e;

    /* renamed from: f */
    private final afkl f116048f;

    public bgci(Context context, afkl afkl, beeu beeu, bugn bugn, bgbq bgbq, bugm bugm) {
        this.f116043a = context;
        this.f116048f = afkl;
        this.f116044b = beeu;
        this.f116045c = bugn;
        this.f116047e = bgbq;
        this.f116046d = bugm;
    }

    /* renamed from: a */
    public final Map mo62639a() {
        HashMap hashMap = new HashMap();
        ArrayList a = bnkn.m109665a(cezb.f183522a.mo6606a().nanoAppGroupList().trim().split("\\s*,\\s*"));
        a.remove("");
        if (!a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.f116048f.mo34919a((String) a.get(i), "com.google.android.gms"));
            }
            try {
                aucu.m76783a(aucu.m76779a((Collection) arrayList), cezb.f183522a.mo6606a().nanoAppMddTimeoutMs(), TimeUnit.MILLISECONDS);
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    List<MddFile> list = ((FileGroupResponse) ((aucb) arrayList.get(i2)).mo50386d()).f79963c;
                    if (!list.isEmpty()) {
                        for (MddFile mddFile : list) {
                            try {
                                hashMap.put(Long.valueOf(Long.parseLong(mddFile.f79969a, 16)), Uri.parse(mddFile.f79970b));
                            } catch (NumberFormatException e) {
                                Object[] objArr = {"Updater:", mddFile.f79969a, e};
                            }
                        }
                    }
                }
                return hashMap;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Object[] objArr2 = {"Updater:", e2};
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo62640a(long j, int i) {
        bugu bugu;
        buhb buhb = (buhb) this.f116045c;
        int[] findNanoAppOnHub = buhb.f153807e.findNanoAppOnHub(buhb.f153809g, new NanoAppFilter(j, 0, -1, -1));
        buhc buhc = null;
        if (findNanoAppOnHub != null && findNanoAppOnHub.length == 1) {
            buhc = new buhc(j, findNanoAppOnHub[0], buhb.f153807e, buhb, buhb.f153817o, buhb.f153810h);
        }
        if (buhc != null) {
            this.f116046d.mo62659a(j, i);
            buhb buhb2 = (buhb) buhc.f153826d;
            if (buhb2.f153816n) {
                buhm buhm = buhb2.f153812j;
                ContextHubInfo contextHubInfo = buhb2.f153808f;
                bmxy.m108581a(contextHubInfo);
                bmxy.m108581a(buhc);
                bugu = new buhp(buhm.f153867a.unloadNanoApp(contextHubInfo, buhc.f153823a));
            } else {
                buhj buhj = buhb2.f153811i;
                buib buib = new buib(buhj, buhj.f153858j, buhc.f153824b);
                buhj.f153851c.execute(buib);
                bugu = buib;
            }
            try {
                ((Integer) bugu.get(180, TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                Object[] objArr = {"Updater:", Long.valueOf(j), e};
                bgbq bgbq = this.f116047e;
                String exc = e.toString();
                if (cezb.m138454c()) {
                    String hexString = Long.toHexString(j);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 11 + String.valueOf(exc).length());
                    sb.append("Unload: 0x");
                    sb.append(hexString);
                    sb.append(" ");
                    sb.append(exc);
                    bgbq.mo62623a(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62641a(bgch bgch, byte[] bArr) {
        try {
            bgch.f116042d = ((Integer) this.f116045c.mo72628a(bgch.f116040b, bArr).get(180, TimeUnit.SECONDS)).intValue() == 0;
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            Object[] objArr = {"Updater:", Long.valueOf(bgch.f116040b), e};
            bgbq bgbq = this.f116047e;
            long j = bgch.f116040b;
            String exc = e.toString();
            if (cezb.m138454c()) {
                String hexString = Long.toHexString(j);
                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 9 + String.valueOf(exc).length());
                sb.append("Load: 0x");
                sb.append(hexString);
                sb.append(" ");
                sb.append(exc);
                bgbq.mo62623a(sb.toString());
            }
        }
    }
}
