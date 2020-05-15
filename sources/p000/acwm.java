package p000;

import android.app.usage.UsageEvents;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: acwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwm extends bnch implements acwo {

    /* renamed from: a */
    final Queue f60969a;

    /* renamed from: b */
    final absr f60970b;

    /* renamed from: c */
    private final PackageManager f60971c;

    /* renamed from: d */
    private final UsageEvents f60972d;

    /* renamed from: e */
    private final HashMap f60973e = new HashMap();

    /* renamed from: f */
    private final HashMap f60974f = new HashMap();

    /* renamed from: g */
    private final HashSet f60975g = new HashSet();

    /* renamed from: h */
    private String f60976h = null;

    /* renamed from: i */
    private int f60977i = 0;

    /* renamed from: j */
    private final abym f60978j;

    public acwm(PackageManager packageManager, absr absr, UsageEvents usageEvents, String str, abym abym) {
        this.f60971c = packageManager;
        this.f60970b = absr;
        this.f60972d = usageEvents;
        this.f60969a = new LinkedList();
        this.f60975g.add(str);
        this.f60978j = abym;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        List<String> list;
        acxq acxq = (acxq) this.f60969a.poll();
        if (acxq == null) {
            UsageEvents.Event event = new UsageEvents.Event();
            while (true) {
                if (this.f60972d.getNextEvent(event)) {
                    if (event.getEventType() == 1 && !TextUtils.isEmpty(event.getPackageName()) && !event.getPackageName().equals(this.f60976h) && !this.f60975g.contains(event.getPackageName())) {
                        String packageName = event.getPackageName();
                        this.f60976h = packageName;
                        list = (List) this.f60974f.get(packageName);
                        if (list != null) {
                            break;
                        }
                        list = C1599acls.m49400a(C1599acls.m49403b(this.f60971c, packageName));
                        if (!list.isEmpty()) {
                            this.f60974f.put(packageName, list);
                            break;
                        }
                        this.f60975g.add(packageName);
                    }
                } else {
                    break;
                }
            }
            for (String str : list) {
                String str2 = (String) this.f60973e.get(str);
                if (str2 == null) {
                    str2 = aclk.m49387a(ComponentName.unflattenFromString(str));
                    this.f60973e.put(str, str2);
                }
                long timeStamp = event.getTimeStamp();
                int i = acwn.f60979a;
                bxvd da = abuu.f58469m.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abuu abuu = (abuu) da.f164949b;
                str2.getClass();
                int i2 = abuu.f58471a | 16;
                abuu.f58471a = i2;
                abuu.f58476f = str2;
                abuu.f58471a = i2 | 32;
                abuu.f58477g = timeStamp;
                abuy abuy = abuy.GENERAL_USE;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abuu abuu2 = (abuu) da.f164949b;
                abuu2.f58478h = abuy.f58502g;
                int i3 = abuu2.f58471a | 64;
                abuu2.f58471a = i3;
                abuu2.f58471a = i3 | 512;
                abuu2.f58481k = true;
                this.f60977i++;
                this.f60969a.offer(new acxq((abuu) da.mo74062i(), this.f60970b, null));
            }
            acxq = (acxq) this.f60969a.poll();
            if (acxq == null) {
                return (acxq) mo67118d();
            }
        }
        return acxq;
    }

    public final void close() {
        int i = this.f60977i;
        if (i > 0) {
            absg.m48202d("App usage reports: %d", Integer.valueOf(i));
            abym abym = this.f60978j;
            int i2 = this.f60977i;
            long d = cema.f182934a.mo6606a().mo79302d();
            if (abym.mo32452a(d)) {
                bxvd da = bpwq.f139548c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpwq bpwq = (bpwq) da.f164949b;
                bpwq.f139550a |= 1;
                bpwq.f139551b = i2;
                bpwq bpwq2 = (bpwq) da.mo74062i();
                bxvd da2 = bpxb.f139606R.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpxb bpxb = (bpxb) da2.f164949b;
                bpwq2.getClass();
                bpxb.f139636l = bpwq2;
                bpxb.f139625a |= 1024;
                abym.mo32438a(3002, da2, d);
            }
        }
    }
}
