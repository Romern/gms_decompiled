package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: apia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apia {

    /* renamed from: a */
    public static final /* synthetic */ int f84420a = 0;

    /* renamed from: b */
    private static final EnumMap f84421b;

    /* renamed from: c */
    private static final int f84422c = aapx.values().length;

    /* renamed from: d */
    private final bnnn f84423d = bngf.m109301b(f84422c);

    /* renamed from: e */
    private final bnnn f84424e = bngf.m109301b(f84422c);

    /* renamed from: f */
    private final Map f84425f = new C1223np();

    /* renamed from: g */
    private final long f84426g = SystemClock.elapsedRealtime();

    /* renamed from: h */
    private final aphy f84427h;

    /* renamed from: i */
    private final Context f84428i;

    /* renamed from: j */
    private final Random f84429j;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [aapx, java.lang.String]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    static {
        EnumMap enumMap = new EnumMap(aapx.class);
        f84421b = enumMap;
        enumMap.put((Enum) aapx.ALARM_MANAGER, (Object) aapx.ALARM_MANAGER.name());
        f84421b.put((Enum) aapx.CAUSE_UNKNOWN, (Object) aapx.CAUSE_UNKNOWN.name());
        f84421b.put((Enum) aapx.CLIENT_LIB, (Object) aapx.CLIENT_LIB.name());
        f84421b.put((Enum) aapx.CONTENT_URI_UPDATED, (Object) aapx.CONTENT_URI_UPDATED.name());
        f84421b.put((Enum) aapx.DEVICE_CHARGING, (Object) aapx.DEVICE_CHARGING.name());
        f84421b.put((Enum) aapx.EXECUTION_CALLBACK, (Object) aapx.EXECUTION_CALLBACK.name());
        f84421b.put((Enum) aapx.GOOGLE_HTTP_CLIENT, (Object) aapx.GOOGLE_HTTP_CLIENT.name());
        f84421b.put((Enum) aapx.DOZE_MAINTENANCE_WINDOW, (Object) aapx.DOZE_MAINTENANCE_WINDOW.name());
        f84421b.put((Enum) aapx.DOZE_LIGHT_MAINTENANCE_WINDOW, (Object) aapx.DOZE_LIGHT_MAINTENANCE_WINDOW.name());
        f84421b.put((Enum) aapx.CLOUD_MESSAGE_RECEIVED, (Object) "GCM_DOWNSTREAM");
        f84421b.put((Enum) aapx.CLOUD_MESSAGE_SENT, (Object) "GCM_UPSTREAM");
        f84421b.put((Enum) aapx.NETWORK_CONNECTED, (Object) "DEVICE_CONNECTED");
    }

    public apia(Context context) {
        Random random = new Random();
        this.f84428i = context;
        sdo.m34959a(context);
        this.f84427h = new aphy(context);
        this.f84429j = random;
    }

    /* renamed from: a */
    private final aphz m70338a(aapm aapm) {
        aphz aphz = (aphz) this.f84425f.get(aapm);
        if (aphz != null) {
            return aphz;
        }
        aphz aphz2 = new aphz();
        this.f84425f.put(aapm, aphz2);
        return aphz2;
    }

    /* renamed from: b */
    public final synchronized void mo47253b(aapx aapx) {
        this.f84424e.add(aapx);
    }

    /* renamed from: c */
    public final synchronized void mo47254c(aapx aapx) {
        this.f84423d.add(aapx);
    }

    /* renamed from: a */
    public static String m70339a(aapx aapx) {
        return (String) f84421b.get(aapx);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo47242a() {
        return (SystemClock.elapsedRealtime() - this.f84426g) / 1000;
    }

    /* renamed from: a */
    public final void mo47243a(aapu aapu, aapk aapk) {
        if (mo47252a(cdnk.f181321a.mo6606a().mo77970d())) {
            bxvd da = aaps.f28828e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaps aaps = (aaps) da.f164949b;
            aapu.getClass();
            aaps.f28833d = aapu;
            aaps.f28830a |= 1;
            aapk.getClass();
            aaps.f28832c = aapk;
            aaps.f28831b = 5;
            this.f84427h.mo47241a((aaps) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo47244a(aapu aapu, aapz aapz) {
        if (mo47252a(cdnk.f181321a.mo6606a().mo77973g())) {
            bxvd da = aaps.f28828e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaps aaps = (aaps) da.f164949b;
            aapu.getClass();
            aaps.f28833d = aapu;
            aaps.f28830a |= 1;
            aapz.getClass();
            aaps.f28832c = aapz;
            aaps.f28831b = 8;
            this.f84427h.mo47241a((aaps) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo47245a(aapu aapu, apik apik, int i) {
        aapm aapm;
        boolean z;
        aapc aapc;
        aapc aapc2;
        aapb aapb;
        apik apik2 = apik;
        if (mo47252a(cdnk.f181321a.mo6606a().mo77969c())) {
            apid apid = apik2.f84459a;
            aapm aapm2 = apid.f84431a;
            if (aapm2 == null) {
                aapm = aapm.f28803f;
            } else {
                bxvd bxvd = (bxvd) aapm2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) aapm2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                aapm aapm3 = (aapm) bxvd.f164949b;
                aapm3.f28805a &= -5;
                aapm3.f28808d = aapm.f28803f.f28808d;
                if (!rfz.m33557a(this.f84428i).mo24610b(aapm2.f28806b)) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aapm aapm4 = (aapm) bxvd.f164949b;
                    aapm4.f28805a &= -2;
                    aapm4.f28806b = aapm.f28803f.f28806b;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aapm aapm5 = (aapm) bxvd.f164949b;
                    aapm5.f28805a &= -3;
                    aapm5.f28807c = aapm.f28803f.f28807c;
                }
                aapm = (aapm) bxvd.mo74062i();
            }
            bxvd da = aapl.f28790l.mo74144da();
            boolean z2 = apid.f84436f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapl aapl = (aapl) da.f164949b;
            int i2 = aapl.f28792a | 2;
            aapl.f28792a = i2;
            aapl.f28794c = z2;
            if (apid.f84445o == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = i2 | 4;
            aapl.f28792a = i3;
            aapl.f28795d = z;
            aapm.getClass();
            aapl.f28793b = aapm;
            int i4 = i3 | 1;
            aapl.f28792a = i4;
            aeca aeca = apid.f84444n;
            boolean z3 = aeca.f63115h;
            aapl.f28792a = i4 | 8;
            aapl.f28796e = z3;
            bxvd da2 = aapa.f28723i.mo74144da();
            int a = apka.m70503a(aeca.f63121n);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapa aapa = (aapa) da2.f164949b;
            aapa.f28727c = a - 1;
            aapa.f28725a |= 8;
            int a2 = apka.m70503a(aeca.f63122o);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapa aapa2 = (aapa) da2.f164949b;
            aapa2.f28729e = a2 - 1;
            aapa2.f28725a |= 32;
            int b = apka.m70508b(aeca.f63123p);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapa aapa3 = (aapa) da2.f164949b;
            aapa3.f28728d = b - 1;
            aapa3.f28725a |= 16;
            int b2 = apka.m70508b(aeca.f63124q);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapa aapa4 = (aapa) da2.f164949b;
            aapa4.f28730f = b2 - 1;
            aapa4.f28725a |= 64;
            int c = apka.m70509c(aeca.f63125r);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapa aapa5 = (aapa) da2.f164949b;
            aapa5.f28731g = c - 1;
            aapa5.f28725a |= 128;
            int c2 = apka.m70509c(aeca.f63126s);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapa aapa6 = (aapa) da2.f164949b;
            aapa6.f28732h = c2 - 1;
            aapa6.f28725a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            for (Uri uri : aeca.f63118k) {
                da2.mo74081l(uri.toString());
            }
            aapa aapa7 = (aapa) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapl aapl2 = (aapl) da.f164949b;
            aapa7.getClass();
            aapl2.f28797f = aapa7;
            int i5 = aapl2.f28792a | 16;
            aapl2.f28792a = i5;
            aaos aaos = apid.f84440j;
            aaos.getClass();
            aapl2.f28799h = aaos;
            aapl2.f28792a = i5 | 64;
            aapj a3 = apka.m70505a(apid);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapl aapl3 = (aapl) da.f164949b;
            a3.getClass();
            aapl3.f28800i = a3;
            int i6 = aapl3.f28792a | 128;
            aapl3.f28792a = i6;
            if (apid.f84445o == 1) {
                aebm aebm = (aebm) apid.f84444n;
                long j = aebm.f63072a;
                int i7 = i6 | 512;
                aapl3.f28792a = i7;
                aapl3.f28801j = j;
                long j2 = aebm.f63073b;
                aapl3.f28792a = i7 | 1024;
                aapl3.f28802k = j2;
            }
            if (apid.mo47280q()) {
                aapp aapp = apid.f84432b;
                if (aapp.f28821b == 3) {
                    aapc = (aapc) aapp.f28822c;
                } else {
                    aapc = aapc.f28738b;
                }
                if (aapc != null) {
                    bxwc bxwc = aapc.f28740a;
                    bxvd bxvd2 = (bxvd) aapc.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) aapc);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    aapc aapc3 = aapc.f28738b;
                    ((aapc) bxvd2.f164949b).f28740a = GeneratedMessageLite.m124030de();
                    int size = bxwc.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        aapb aapb2 = (aapb) bxwc.get(i8);
                        if (aapb2 == null) {
                            aapb = aapb.f28733d;
                        } else {
                            String authority = Uri.parse(aapb2.f28736b).getAuthority();
                            if (authority == null) {
                                Log.e("NetworkScheduler.Stats", "Task trigger contains malformed content URI");
                                aapb = aapb.f28733d;
                            } else {
                                ProviderInfo resolveContentProvider = this.f84428i.getPackageManager().resolveContentProvider(authority, 0);
                                if (resolveContentProvider == null || resolveContentProvider.packageName == null) {
                                    aapb = aapb.f28733d;
                                } else {
                                    String builder = rfz.m33557a(this.f84428i).mo24610b(resolveContentProvider.packageName) ? new Uri.Builder().authority(authority).scheme("content").toString() : "";
                                    bxvd da3 = aapb.f28733d.mo74144da();
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    aapb aapb3 = (aapb) da3.f164949b;
                                    builder.getClass();
                                    int i9 = aapb3.f28735a | 1;
                                    aapb3.f28735a = i9;
                                    aapb3.f28736b = builder;
                                    boolean z4 = aapb2.f28737c;
                                    aapb3.f28735a = i9 | 2;
                                    aapb3.f28737c = z4;
                                    aapb = (aapb) da3.mo74062i();
                                }
                            }
                        }
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        aapc aapc4 = (aapc) bxvd2.f164949b;
                        aapb.getClass();
                        aapc4.mo17179a();
                        aapc4.f28740a.add(aapb);
                    }
                    aapc2 = (aapc) bxvd2.mo74062i();
                } else {
                    aapc2 = aapc.f28738b;
                }
                bxvd bxvd3 = (bxvd) aapp.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) aapp);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                aapp aapp2 = (aapp) bxvd3.f164949b;
                aapp aapp3 = aapp.f28818e;
                aapc2.getClass();
                aapp2.f28822c = aapc2;
                aapp2.f28821b = 3;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aapl aapl4 = (aapl) da.f164949b;
                aapp aapp4 = (aapp) bxvd3.mo74062i();
                aapp4.getClass();
                aapl4.f28798g = aapp4;
                aapl4.f28792a |= 32;
            } else {
                aapp aapp5 = apid.f84432b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aapl aapl5 = (aapl) da.f164949b;
                aapp5.getClass();
                aapl5.f28798g = aapp5;
                aapl5.f28792a |= 32;
            }
            aapl aapl6 = (aapl) da.mo74062i();
            int i10 = apik2.f84461c;
            bxvd da4 = aapf.f28749i.mo74144da();
            int i11 = i10 & 1;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            aapf aapf = (aapf) da4.f164949b;
            int i12 = aapf.f28751a | 1;
            aapf.f28751a = i12;
            aapf.f28752b = i11 != 0;
            boolean z5 = (i10 & 2) > 0;
            int i13 = i12 | 2;
            aapf.f28751a = i13;
            aapf.f28753c = z5;
            boolean z6 = (i10 & 4) > 0;
            int i14 = i13 | 4;
            aapf.f28751a = i14;
            aapf.f28754d = z6;
            boolean z7 = (i10 & 8) > 0;
            int i15 = i14 | 8;
            aapf.f28751a = i15;
            aapf.f28755e = z7;
            boolean z8 = (i10 & 16) > 0;
            int i16 = i15 | 16;
            aapf.f28751a = i16;
            aapf.f28756f = z8;
            boolean z9 = (i10 & 32) > 0;
            int i17 = i16 | 32;
            aapf.f28751a = i17;
            aapf.f28757g = z9;
            boolean z10 = (i10 & 64) > 0;
            aapf.f28751a = i17 | 64;
            aapf.f28758h = z10;
            aapf aapf2 = (aapf) da4.mo74062i();
            apid apid2 = apik2.f84459a;
            bxvd da5 = aaph.f28760j.mo74144da();
            int i18 = apik2.f84467i;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            aaph aaph = (aaph) da5.f164949b;
            aaph.f28766e = i18 - 1;
            aaph.f28762a |= 8;
            bxun e = apik.mo47299e();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            aaph aaph2 = (aaph) da5.f164949b;
            e.getClass();
            aaph2.f28764c = e;
            int i19 = aaph2.f28762a | 2;
            aaph2.f28762a = i19;
            aaph2.f28767f = i - 1;
            int i20 = i19 | 16;
            aaph2.f28762a = i20;
            aapl6.getClass();
            aaph2.f28763b = aapl6;
            aaph2.f28762a = i20 | 1;
            bxun d = apik.mo47298d();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            aaph aaph3 = (aaph) da5.f164949b;
            d.getClass();
            aaph3.f28765d = d;
            int i21 = aaph3.f28762a | 4;
            aaph3.f28762a = i21;
            aaph3.f28768g = apik2.f84460b.f28863p;
            int i22 = i21 | 64;
            aaph3.f28762a = i22;
            aapf2.getClass();
            aaph3.f28769h = aapf2;
            aaph3.f28762a = i22 | 128;
            int a4 = (int) apid2.mo47258a(apik.mo47300f());
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            aaph aaph4 = (aaph) da5.f164949b;
            aaph4.f28762a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aaph4.f28770i = a4;
            bxvd da6 = aaps.f28828e.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            aaps aaps = (aaps) da6.f164949b;
            aapu.getClass();
            aaps.f28833d = aapu;
            aaps.f28830a |= 1;
            aaph aaph5 = (aaph) da5.mo74062i();
            aaph5.getClass();
            aaps.f28832c = aaph5;
            aaps.f28831b = 6;
            this.f84427h.mo47241a((aaps) da6.mo74062i());
        }
    }

    /* renamed from: a */
    public final synchronized void mo47246a(apid apid, int i) {
        aphz a = m70338a(apid.f84431a);
        if (i == 0) {
            a.f84412a++;
        } else if (i == 1) {
            a.f84413b++;
        } else if (i == 2) {
            a.f84414c++;
        } else if (i == 3) {
            a.f84415d++;
        } else if (i == 4) {
            a.f84416e++;
        }
    }

    /* renamed from: a */
    public final synchronized void mo47247a(apid apid, int i, int i2) {
        aphz a = m70338a(apid.f84431a);
        a.f84418g += (long) i;
        a.f84417f += (long) i2;
    }

    /* renamed from: a */
    public final synchronized void mo47248a(apid apid, long j) {
        m70338a(apid.f84431a).f84419h = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47249a(PrintWriter printWriter) {
        long a = mo47242a();
        StringBuilder sb = new StringBuilder(51);
        sb.append("\nRunning for the last ");
        sb.append(a);
        sb.append(" seconds.");
        printWriter.println(sb.toString());
        aapx[] values = aapx.values();
        int i = 0;
        for (aapx aapx : values) {
            int a2 = this.f84423d.mo67285a(aapx);
            i += a2;
            String str = (String) f84421b.get(aapx);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
            sb2.append(str);
            sb2.append(" ");
            sb2.append(a2);
            printWriter.println(sb2.toString());
        }
        aapx[] values2 = aapx.values();
        int i2 = 0;
        for (aapx aapx2 : values2) {
            int a3 = this.f84424e.mo67285a(aapx2);
            i2 += a3;
            String str2 = (String) f84421b.get(aapx2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 26);
            sb3.append("TOTAL_WAKEUPS_");
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(a3);
            printWriter.println(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(28);
        sb4.append("TOTAL_EXECUTIONS ");
        sb4.append(i);
        printWriter.println(sb4.toString());
        StringBuilder sb5 = new StringBuilder(25);
        sb5.append("TOTAL_WAKEUPS ");
        sb5.append(i2);
        printWriter.println(sb5.toString());
    }

    /* renamed from: a */
    public final synchronized void mo47250a(PrintWriter printWriter, aapm aapm) {
        aphz aphz = (aphz) this.f84425f.get(aapm);
        if (aphz == null) {
            printWriter.println("No stats recorded.");
            return;
        }
        printWriter.append((CharSequence) "successes: ").print(aphz.f84412a);
        printWriter.append((CharSequence) " reschedules: ").print(aphz.f84413b);
        printWriter.append((CharSequence) " failures: ").print(aphz.f84414c);
        printWriter.append((CharSequence) " timeouts: ").print(aphz.f84415d);
        printWriter.append((CharSequence) " invalid_service: ").print(aphz.f84416e);
        printWriter.append((CharSequence) " total_elapsed_millis: ").print(aphz.f84418g);
        printWriter.append((CharSequence) " total_uptime_millis: ").print(aphz.f84417f);
        printWriter.append((CharSequence) " last_exec_start_seconds: ").print(aphz.f84419h);
        printWriter.println();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47251a(PrintWriter printWriter, List list) {
        printWriter.println("Past executions:\n");
        HashMap hashMap = new HashMap();
        long j = 0;
        for (aapm aapm : this.f84425f.keySet()) {
            ComponentName componentName = new ComponentName(aapm.f28806b, aapm.f28807c);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (componentName.flattenToShortString().contains((String) it.next())) {
                    int b = bqcn.m112585b(((aphz) this.f84425f.get(aapm)).f84417f);
                    j += (long) b;
                    hashMap.put(aapm, Integer.valueOf(b));
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new aphx(hashMap));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aapm aapm2 = (aapm) arrayList.get(i);
            printWriter.printf("[cost:%d%%] (finished) [%s:%s,u%s]%n", Integer.valueOf(Math.round((((float) ((Integer) hashMap.get(aapm2)).intValue()) * 100.0f) / ((float) j))), new ComponentName(aapm2.f28806b, aapm2.f28807c).flattenToShortString(), aapm2.f28808d, Long.valueOf(aapm2.f28809e));
            mo47250a(printWriter, aapm2);
            printWriter.println();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47252a(double d) {
        if (cdnk.f181321a.mo6606a().mo77967a()) {
            double nextDouble = this.f84429j.nextDouble();
            double e = cdnk.f181321a.mo6606a().mo77971e();
            double nextDouble2 = this.f84429j.nextDouble();
            if (nextDouble >= e || nextDouble2 >= d) {
                return false;
            }
            return true;
        }
        return false;
    }
}
