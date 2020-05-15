package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* renamed from: auhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhs extends PhoneStateListener {

    /* renamed from: a */
    private final TelephonyManager f91833a;

    /* renamed from: b */
    private final Executor f91834b;

    /* renamed from: c */
    private final int f91835c;

    /* renamed from: d */
    private Integer f91836d;

    /* renamed from: e */
    private auii f91837e;

    public auhs(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        this.f91833a = ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(i);
        this.f91834b = null;
        this.f91835c = i;
        this.f91837e = null;
        this.f91836d = null;
    }

    /* renamed from: a */
    public final synchronized void mo50534a() {
        if (this.f91837e != null) {
            this.f91837e = null;
            this.f91833a.listen(this, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1 = r11.f91835c;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.f91879b == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r12 != 2) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0.f91879b = true;
        r0.f91880c = android.os.SystemClock.elapsedRealtime();
        r0 = r0.f91881d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (p000.cgyq.m147646d() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r0.f91882a.add(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0.f91883b++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (p000.auho.m77070a() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r2 = java.lang.String.valueOf(r0);
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 29);
        r8.append(r2);
        r8.append(" call begins on [");
        r8.append(r1);
        r8.append("]");
        android.util.Log.d("Thunderbird", r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        r2 = r0.f91882a.f26758b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (r2 != 1) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r0.f91883b == 1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r2 <= 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r12 = r0.f91884c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r12 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r12.cancel(false);
        r0.f91884c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r12 = r0.f91916e;
        r2 = r12.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r6 >= r2) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        ((p000.auiq) r12.get(r6)).mo50558a(Long.MAX_VALUE);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (p000.cgyq.m147646d() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        r0.f91884c = r0.f91915d.f91796a.mo25814a(new p000.auif(r0, r1), 500, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (java.lang.Boolean.TRUE.equals(r0.f91879b) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d2, code lost:
        if (r12 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        r0.f91879b = false;
        r12 = r0.f91881d;
        r7 = android.os.SystemClock.elapsedRealtime() - r0.f91880c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
        if (p000.auho.m77070a() == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
        r0 = java.lang.String.valueOf(r12);
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 27);
        r9.append(r0);
        r9.append(" call ends on [");
        r9.append(r1);
        r9.append("]");
        android.util.Log.d("Thunderbird", r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0119, code lost:
        if (p000.cgyq.m147646d() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        r12.f91882a.remove(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0125, code lost:
        r12.f91883b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0131, code lost:
        if (r12.f91882a.isEmpty() == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        if (r12.f91883b > 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        r0 = r12.mo50576i();
        r2 = r12.f91916e;
        r4 = r2.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0142, code lost:
        if (r5 >= r4) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        ((p000.auiq) r2.get(r5)).mo50558a(r0);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        if (r7 >= 500) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        if (p000.auho.m77070a() == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015a, code lost:
        r0 = java.lang.String.valueOf(r12);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 38);
        r4.append(r0);
        r4.append(" subscription ");
        r4.append(r1);
        r4.append(" filtered out");
        android.util.Log.d("Thunderbird", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0186, code lost:
        r12.mo50571a(new p000.auig(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018e, code lost:
        r0 = r12.f91884c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0190, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0192, code lost:
        r0.cancel(false);
        r12.f91884c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0197, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo50535a(int i) {
        synchronized (this) {
            if (this.f91837e != null) {
                Integer num = this.f91836d;
                if (num != null) {
                    if (i == num.intValue()) {
                    }
                }
                this.f91836d = Integer.valueOf(i);
                auii auii = this.f91837e;
            }
        }
    }

    public final void onCallStateChanged(int i, String str) {
        int i2 = Build.VERSION.SDK_INT;
        mo50535a(i);
    }

    public auhs(Context context, int i, Executor executor) {
        super(executor);
        bmxy.m108600b(true);
        this.f91833a = ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(i);
        this.f91834b = executor;
        this.f91835c = i;
        this.f91837e = null;
        this.f91836d = null;
    }

    /* renamed from: a */
    public final synchronized void mo50536a(auii auii) {
        boolean z = true;
        bmxy.m108588a(true);
        if (this.f91837e != null) {
            z = false;
        }
        bmxy.m108600b(z);
        this.f91837e = auii;
        this.f91836d = null;
        int callState = this.f91833a.getCallState();
        Executor executor = this.f91834b;
        if (executor != null) {
            executor.execute(new auhr(this, callState));
        } else {
            mo50535a(callState);
        }
        this.f91833a.listen(this, 32);
    }
}
