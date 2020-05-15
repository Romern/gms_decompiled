package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: avog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avog extends avnn {

    /* renamed from: e */
    public static final avto f93581e = new avto("file_path", "");

    /* renamed from: f */
    public static final avta f93582f = new avta("package_processed", false);

    /* renamed from: g */
    public static final avtk f93583g = new avtk("boot_token", -1L);

    /* renamed from: h */
    public static final avta f93584h = new avta("reboot_prepared", false);

    /* renamed from: j */
    private static final Logger f93585j = avpq.m79018e("NonAbRebootAction");

    /* renamed from: k */
    private static final bnic f93586k = bnic.m109490a((Object) 20, (Object) 23);

    /* renamed from: l */
    private static final avto f93587l = new avto("installation_success_message", "");

    /* renamed from: m */
    private static final avto f93588m = new avto("installation_failure_message", "");

    /* renamed from: n */
    private static final avta f93589n = new avta("install_in_progress", false);

    /* renamed from: i */
    public final Context f93590i;

    /* renamed from: o */
    private final avmi f93591o = ((avmi) avmi.f93389c.mo51589b());

    /* renamed from: p */
    private final avmq f93592p = ((avmq) avmq.f93413e.mo51589b());

    /* renamed from: q */
    private final avmx f93593q = ((avmx) avmx.f93453h.mo51589b());

    /* renamed from: r */
    private final avpp f93594r;

    public avog(Context context, avte avte) {
        super("non-ab-reboot", avte);
        this.f93590i = context;
        this.f93594r = avpp.m79008a(context);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b2, code lost:
        if (r10.equals("source_build") != false) goto L_0x00e8;
     */
    /* renamed from: a */
    private final void m78908a(Map map) {
        bxvd da = bohq.f133128l.mo74144da();
        Iterator it = map.entrySet().iterator();
        long j = 0;
        long j2 = 0;
        while (true) {
            char c = 6;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((String) entry.getKey()).startsWith("bytes_stashed")) {
                    j += ((Long) entry.getValue()).longValue();
                } else if (((String) entry.getKey()).startsWith("bytes_written")) {
                    j2 += ((Long) entry.getValue()).longValue();
                } else if (((Long) entry.getValue()).longValue() > 2147483647L) {
                    f93585j.mo25418e("Number overflow: %s = %d.", entry.getKey(), entry.getValue());
                } else {
                    String str = (String) entry.getKey();
                    int intValue = ((Long) entry.getValue()).intValue();
                    switch (str.hashCode()) {
                        case -826341929:
                            if (str.equals("temperature_start")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 94434409:
                            if (str.equals("cause")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 96784904:
                            if (str.equals("error")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115402327:
                            if (str.equals("uncrypt_time")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1136755538:
                            if (str.equals("time_total")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1654837578:
                            break;
                        case 2077336464:
                            if (str.equals("temperature_end")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2077343769:
                            if (str.equals("temperature_max")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq = (bohq) da.f164949b;
                            bohq.f133130a |= 2;
                            bohq.f133132c = intValue;
                            continue;
                        case 1:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq2 = (bohq) da.f164949b;
                            bohq2.f133130a |= 4;
                            bohq2.f133133d = intValue;
                            continue;
                        case 2:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq3 = (bohq) da.f164949b;
                            bohq3.f133130a |= 8;
                            bohq3.f133134e = intValue;
                            continue;
                        case 3:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq4 = (bohq) da.f164949b;
                            bohq4.f133130a |= 16;
                            bohq4.f133135f = intValue;
                            continue;
                        case 4:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq5 = (bohq) da.f164949b;
                            bohq5.f133130a |= 64;
                            bohq5.f133137h = intValue;
                            continue;
                        case 5:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq6 = (bohq) da.f164949b;
                            bohq6.f133130a |= 128;
                            bohq6.f133138i = intValue;
                            continue;
                        case 6:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq7 = (bohq) da.f164949b;
                            bohq7.f133130a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bohq7.f133139j = intValue;
                            continue;
                        case 7:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bohq bohq8 = (bohq) da.f164949b;
                            bohq8.f133130a |= 512;
                            bohq8.f133140k = intValue;
                            continue;
                        default:
                            f93585j.mo25416d("Unrecognized proto name: %s", str);
                            continue;
                    }
                }
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bohq bohq9 = (bohq) da.f164949b;
                int i = bohq9.f133130a | 1;
                bohq9.f133130a = i;
                bohq9.f133131b = j;
                bohq9.f133130a = i | 32;
                bohq9.f133136g = j2;
                avpp avpp = this.f93594r;
                bohq bohq10 = (bohq) da.mo74062i();
                bxvd a = avpp.mo51476a(6);
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bohn bohn = (bohn) a.f164949b;
                bohn bohn2 = bohn.f133102n;
                bohq10.getClass();
                bohn.f133112i = bohq10;
                bohn.f133104a |= 128;
                avpp.mo51478a((bohn) a.mo74062i());
                return;
            }
        }
    }

    /* renamed from: e */
    private final boolean m78909e() {
        return ((Boolean) mo51433a(f93584h)).booleanValue() && ((Long) mo51433a(f93583g)).longValue() != this.f93592p.mo51394d();
    }

    /* renamed from: f */
    private static bmxv m78910f() {
        try {
            String a = bobi.m111039a(new File("/cache/recovery/last_install"), bmwy.f131158c).mo68797a();
            HashMap hashMap = new HashMap();
            for (String str : bmyx.m108640a(10).mo66920b().mo66917a().mo66918a((CharSequence) a)) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    try {
                        hashMap.put(split[0].trim(), Long.valueOf(Long.parseLong(split[1].trim())));
                    } catch (NumberFormatException e) {
                        f93585j.mo25418e("Failed to parse numbers in %s", str, e);
                    }
                }
            }
            return bmxv.m108566b(hashMap);
        } catch (IOException e2) {
            f93585j.mo25418e("Failed to read installation status in %s.", "/cache/recovery/last_install");
            return bmvz.f131120a;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        if (p000.avog.f93586k.contains(java.lang.Integer.valueOf(r0.intValue())) != false) goto L_0x0110;
     */
    /* renamed from: c */
    public final avni mo51435c() {
        this.f93591o.mo51379d();
        if (((Boolean) this.f93593q.f93472k.mo51607b(avmx.f93452g)).booleanValue()) {
            this.f93593q.mo51402a(1031, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
        avsw a = avou.m78959a();
        if (cfsg.m142815b() && avlx.m78768b(a) && !m78909e()) {
            f93585j.mo25414c("Bypassing the self-update check.", new Object[0]);
        } else if (avlx.m78768b(a)) {
            if (!((String) mo51433a(f93587l)).isEmpty()) {
                this.f93590i.startActivity(avmg.m78796a((String) mo51433a(f93587l)));
            }
            bmxv f = m78910f();
            if (f.mo66813a()) {
                m78908a((Map) f.mo66814b());
            }
            this.f93593q.mo51402a(5, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
        if (m78909e() && !avlx.m78768b(a)) {
            bmxv f2 = m78910f();
            if (f2.mo66813a()) {
                m78908a((Map) f2.mo66814b());
                Long l = (Long) ((Map) f2.mo66814b()).get("error");
                if (l != null) {
                }
            }
            this.f93593q.mo51402a(775, -1.0d);
            if (!((String) mo51433a(f93588m)).isEmpty()) {
                this.f93590i.startActivity(avmg.m78796a((String) mo51433a(f93588m)));
            }
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
        SystemUpdateStatus d = this.f93593q.mo51414d();
        if (bmxx.m108577a(d.f109459a)) {
            this.f93593q.mo51402a(0, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
        try {
            avlr b = avlw.m78758b(this.f93590i, d);
            int i = b.f93325a;
            if (i == 784) {
                Callable callable = null;
                if (!d.f109468j) {
                    if (avme.m78791a(this.f93590i, d, ((Boolean) mo51433a(f93582f)).booleanValue())) {
                        int i2 = Build.VERSION.SDK_INT;
                        try {
                            avpb.m78978a(this.f93590i, new File((String) mo51433a(f93581e)));
                        } catch (IOException e) {
                            f93585j.mo25417e("Failed to execute RecoverySystemDelegate.scheduleUpdateOnBoot().", e, new Object[0]);
                        }
                        this.f93593q.mo51402a(528, -1.0d);
                        avtd b2 = mo51432a().mo51598b();
                        b2.mo51594a(f93583g, Long.valueOf(this.f93592p.mo51394d()));
                        b2.mo51594a(f93587l, (String) avma.f93359e.mo51364a());
                        b2.mo51594a(f93588m, (String) avma.f93360f.mo51364a());
                        b2.mo51594a(f93584h, true);
                        return new avni("non-ab-reboot", b2.mo51593a(), null);
                    } else if (avme.m78794b(this.f93590i, d, ((Boolean) mo51433a(f93582f)).booleanValue())) {
                        this.f93593q.mo51402a(272, -1.0d);
                        avoa f3 = avob.m78904f();
                        f3.mo51452a(cfsj.f185629a.mo6606a().mo82658c());
                        avtd b3 = mo51432a().mo51598b();
                        b3.mo51594a(f93584h, false);
                        f3.mo51446a("non-ab-reboot", b3.mo51593a());
                        return f3.mo51447b();
                    }
                }
                if (!((Boolean) mo51433a(f93589n)).booleanValue()) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (!((Boolean) mo51433a(f93582f)).booleanValue()) {
                        callable = new avoe(this);
                    } else {
                        callable = new avof(this);
                    }
                }
                this.f93593q.mo51402a(784, -1.0d);
                avtd b4 = mo51432a().mo51598b();
                b4.mo51594a(f93583g, Long.valueOf(this.f93592p.mo51394d()));
                b4.mo51594a(f93587l, (String) avma.f93359e.mo51364a());
                b4.mo51594a(f93588m, (String) avma.f93360f.mo51364a());
                b4.mo51594a(f93584h, true);
                b4.mo51594a(f93589n, true);
                return new avni("non-ab-reboot", b4.mo51593a(), true, callable);
            }
            this.f93593q.mo51402a(i, -1.0d);
            this.f93591o.mo51378c();
            avoa f4 = avob.m78904f();
            f4.mo51452a(b.f93326b);
            avtd b5 = mo51432a().mo51598b();
            b5.mo51594a(f93584h, false);
            f4.mo51446a("non-ab-reboot", b5.mo51593a());
            return f4.mo51447b();
        } catch (avlq e2) {
            f93585j.mo25417e("Unable to continue due to invalid config.", e2, new Object[0]);
            this.f93593q.mo51402a(519, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: a */
    public final void mo51455a(Exception exc) {
        if ((exc instanceof IOException) || (exc instanceof GeneralSecurityException)) {
            f93585j.mo25417e("Failed to execute RecoverySystem.installPackage().", exc, new Object[0]);
            avmx avmx = this.f93593q;
            avmx.f93472k.mo51605a(avmx.f93452g.mo51602b(true));
            avmx.f93472k.mo51606a(avmx.f93449d);
            this.f93593q.mo51402a(1031, -1.0d);
            return;
        }
        f93585j.mo25419f("Failed to execute RecoverySystem.installPackage() with unexpected exception.", exc, new Object[0]);
        throw exc;
    }
}
