package p000;

import android.content.ComponentName;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: apid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apid {

    /* renamed from: a */
    public final aapm f84431a;

    /* renamed from: b */
    public final aapp f84432b;

    /* renamed from: c */
    public final boolean f84433c;

    /* renamed from: d */
    public final long f84434d;

    /* renamed from: e */
    public long f84435e;

    /* renamed from: f */
    public boolean f84436f;

    /* renamed from: g */
    public long f84437g;

    /* renamed from: h */
    public int f84438h;

    /* renamed from: i */
    public int f84439i;

    /* renamed from: j */
    public aaos f84440j;

    /* renamed from: k */
    public boolean f84441k;

    /* renamed from: l */
    public volatile int f84442l;

    /* renamed from: m */
    public final aapa f84443m;

    /* renamed from: n */
    public final aeca f84444n;

    /* renamed from: o */
    public final int f84445o;

    /* renamed from: p */
    public boolean f84446p;

    /* renamed from: q */
    private final bnoa f84447q;

    /* renamed from: r */
    private final Set f84448r;

    /* renamed from: s */
    private Set f84449s;

    private apid(aeca aeca, int i, aapm aapm, long j) {
        aapp aapp;
        this.f84439i = -1;
        boolean z = false;
        this.f84441k = false;
        this.f84448r = new C1225nr();
        this.f84449s = bnon.f131923a;
        this.f84446p = false;
        this.f84444n = aeca;
        this.f84445o = i;
        this.f84431a = aapm;
        this.f84434d = j;
        this.f84442l = 0;
        bxvd da = aapa.f28723i.mo74144da();
        int a = apka.m70503a(aeca.f63121n);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapa aapa = (aapa) da.f164949b;
        aapa.f28727c = a - 1;
        aapa.f28725a |= 8;
        int a2 = apka.m70503a(aeca.f63122o);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapa aapa2 = (aapa) da.f164949b;
        aapa2.f28729e = a2 - 1;
        aapa2.f28725a |= 32;
        int b = apka.m70508b(aeca.f63123p);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapa aapa3 = (aapa) da.f164949b;
        aapa3.f28728d = b - 1;
        aapa3.f28725a |= 16;
        int b2 = apka.m70508b(aeca.f63124q);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapa aapa4 = (aapa) da.f164949b;
        aapa4.f28730f = b2 - 1;
        aapa4.f28725a |= 64;
        int c = apka.m70509c(aeca.f63125r);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapa aapa5 = (aapa) da.f164949b;
        aapa5.f28731g = c - 1;
        aapa5.f28725a |= 128;
        int c2 = apka.m70509c(aeca.f63126s);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapa aapa6 = (aapa) da.f164949b;
        aapa6.f28732h = c2 - 1;
        aapa6.f28725a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        for (Uri uri : aeca.f63118k) {
            da.mo74081l(uri.toString());
        }
        this.f84443m = (aapa) da.mo74062i();
        if (i == 0) {
            aebj aebj = (aebj) aeca;
            aapp = apka.m70506a(aebj.f63068a, aebj.f63069b);
        } else if (i != 1) {
            bxvd da2 = aapc.f28738b.mo74144da();
            for (aeab aeab : ((aead) aeca).f62980a) {
                bxvd da3 = aapb.f28733d.mo74144da();
                String uri2 = aeab.f62977a.toString();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                aapb aapb = (aapb) da3.f164949b;
                uri2.getClass();
                aapb.f28735a |= 1;
                aapb.f28736b = uri2;
                boolean a3 = aeab.mo33968a();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                aapb aapb2 = (aapb) da3.f164949b;
                aapb2.f28735a |= 2;
                aapb2.f28737c = a3;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                aapc aapc = (aapc) da2.f164949b;
                aapb aapb3 = (aapb) da3.mo74062i();
                aapb3.getClass();
                aapc.mo17179a();
                aapc.f28740a.add(aapb3);
            }
            bxvd da4 = aapp.f28818e.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            aapp aapp2 = (aapp) da4.f164949b;
            aapp2.f28823d = 3;
            aapp2.f28820a |= 1;
            aapc aapc2 = (aapc) da2.mo74062i();
            aapc2.getClass();
            aapp2.f28822c = aapc2;
            aapp2.f28821b = 3;
            aapp = (aapp) da4.mo74062i();
        } else {
            aebm aebm = (aebm) aeca;
            long j2 = aebm.f63072a;
            aapp = apka.m70506a(j2 - aebm.f63073b, j2);
        }
        this.f84432b = aapp;
        this.f84436f = aeca.f63117j;
        this.f84435e = -1;
        this.f84440j = aaos.f28714d;
        this.f84447q = apif.m70389a(aeca);
        if (i == 0 && ((aebj) aeca).f63069b <= 1) {
            z = true;
        }
        this.f84433c = z;
    }

    /* renamed from: a */
    public static apid m70356a(aeca aeca, ComponentName componentName, long j, int i) {
        int i2;
        if (aeca instanceof aebj) {
            i2 = 0;
        } else if (aeca instanceof aebm) {
            i2 = 1;
        } else if (aeca instanceof aead) {
            i2 = 2;
        } else {
            throw new IllegalArgumentException("Unknown task instance.");
        }
        bxvd da = aapm.f28803f.mo74144da();
        String packageName = componentName.getPackageName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapm aapm = (aapm) da.f164949b;
        packageName.getClass();
        aapm.f28805a = 1 | aapm.f28805a;
        aapm.f28806b = packageName;
        String className = componentName.getClassName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapm aapm2 = (aapm) da.f164949b;
        className.getClass();
        int i3 = 2 | aapm2.f28805a;
        aapm2.f28805a = i3;
        aapm2.f28807c = className;
        String str = aeca.f63114g;
        str.getClass();
        int i4 = i3 | 4;
        aapm2.f28805a = i4;
        aapm2.f28808d = str;
        aapm2.f28805a = i4 | 8;
        aapm2.f28809e = (long) i;
        return new apid(aeca, i2, (aapm) da.mo74062i(), j);
    }

    /* renamed from: a */
    public final void mo47261a(boolean z) {
        int i = this.f84445o;
        if (i == 0 || i == 2) {
            this.f84446p = z;
        }
    }

    /* renamed from: b */
    public final synchronized Set mo47263b() {
        return Collections.unmodifiableSet(new C1225nr(this.f84448r));
    }

    /* renamed from: c */
    public final synchronized void mo47264c() {
        if (this.f84449s.isEmpty() && !this.f84448r.isEmpty()) {
            this.f84449s = Collections.unmodifiableSet(new C1225nr(this.f84448r));
            this.f84448r.clear();
        }
    }

    /* renamed from: d */
    public final synchronized Set mo47265d() {
        return this.f84449s;
    }

    /* renamed from: e */
    public final String mo47266e() {
        return this.f84431a.f28808d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apid) {
            return this.f84431a.equals(((apid) obj).f84431a);
        }
        return false;
    }

    /* renamed from: f */
    public final ComponentName mo47268f() {
        aapm aapm = this.f84431a;
        return new ComponentName(aapm.f28806b, aapm.f28807c);
    }

    /* renamed from: g */
    public final String mo47269g() {
        return this.f84431a.f28807c;
    }

    /* renamed from: h */
    public final long mo47270h() {
        return ((Long) this.f84447q.mo68172b()).longValue() + this.f84434d;
    }

    public final int hashCode() {
        aapm aapm = this.f84431a;
        int i = aapm.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(aapm).mo74216a(aapm);
        aapm.f164758ag = a;
        return a;
    }

    /* renamed from: i */
    public final long mo47272i() {
        return ((Long) this.f84447q.mo68176e()).longValue() + this.f84434d;
    }

    /* renamed from: j */
    public final aamh mo47273j() {
        aapm aapm = this.f84431a;
        return aamh.m21513a(aapm.f28806b, (int) aapm.f28809e);
    }

    @Deprecated
    /* renamed from: k */
    public final int mo47274k() {
        int a = aaor.m21768a(this.f84440j.f28717b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 4;
                }
                if (i2 != 4) {
                    return i2 != 5 ? 0 : 16;
                }
                return 8;
            }
        }
        return i;
    }

    /* renamed from: l */
    public final int mo47275l() {
        try {
            return Integer.parseInt(this.f84440j.f28718c);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: m */
    public final boolean mo47276m() {
        return !this.f84441k;
    }

    /* renamed from: n */
    public final boolean mo47277n() {
        return this.f84445o == 1 && !this.f84441k;
    }

    /* renamed from: o */
    public final boolean mo47278o() {
        return this.f84431a.f28806b.equals("com.google.android.gms");
    }

    /* renamed from: p */
    public final boolean mo47279p() {
        return this.f84432b.f28821b == 2;
    }

    /* renamed from: q */
    public final boolean mo47280q() {
        return this.f84432b.f28821b == 3;
    }

    /* renamed from: r */
    public final aecl mo47281r() {
        aeck aeck = new aeck();
        aeck.f63140c = this.f84431a.f28806b;
        aeck.f63141d = mo47269g();
        aapm aapm = this.f84431a;
        aeck.f63142e = aapm.f28808d;
        aeck.f63139b = aapm.f28809e;
        aeck.f63138a = mo47274k();
        return aeck.mo34036a();
    }

    /* renamed from: s */
    public final aeco mo47282s() {
        aecn aecn = new aecn();
        aecn.mo34039a((int) this.f84431a.f28809e);
        aecn.mo34041b(mo47268f().getPackageName());
        aecn.mo34040a(mo47268f().getClassName());
        aecn.mo34042c(mo47266e());
        return aecn.mo34038a();
    }

    /* renamed from: t */
    public final void mo47283t() {
        this.f84436f = false;
    }

    public final String toString() {
        String str;
        CharSequence charSequence;
        String str2;
        String str3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        long j = (-(elapsedRealtime - this.f84434d)) / 1000;
        long j2 = this.f84437g;
        String str4 = "N/A";
        if (j2 != 0) {
            StringBuilder sb = new StringBuilder(21);
            sb.append((-(currentTimeMillis - j2)) / 1000);
            sb.append("s");
            str = sb.toString();
        } else {
            str = str4;
        }
        int i = this.f84439i;
        if (i != -1) {
            str4 = Integer.toString(i);
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[13];
        objArr[0] = mo47268f().flattenToShortString();
        objArr[1] = Long.valueOf(this.f84431a.f28809e);
        objArr[2] = JSONObject.quote(this.f84444n.f63114g);
        if (mo47279p()) {
            long a = mo47258a(elapsedRealtime);
            long i2 = (mo47272i() - elapsedRealtime) / 1000;
            if (this.f84444n instanceof aebm) {
                int a2 = aaor.m21768a(this.f84440j.f28717b);
                if (a2 != 0 && a2 == 5) {
                    charSequence = ",";
                } else {
                    aebm aebm = (aebm) this.f84444n;
                    charSequence = ",";
                    str2 = String.format(Locale.US, "window{period=%ds,flex=%ds,earliest=%ds,latest=%ds}", Long.valueOf(aebm.f63072a), Long.valueOf(aebm.f63073b), Long.valueOf(a), Long.valueOf(i2));
                }
            } else {
                charSequence = ",";
            }
            str2 = String.format(Locale.US, "window{start=%ds,end=%ds,earliest=%ds,latest=%ds}", Long.valueOf(((Long) this.f84447q.mo68172b()).longValue() / 1000), Long.valueOf(((Long) this.f84447q.mo68176e()).longValue() / 1000), Long.valueOf(a), Long.valueOf(i2));
        } else {
            charSequence = ",";
            if (this.f84445o == 2) {
                Set<aeab> set = ((aead) this.f84444n).f62980a;
                ArrayList arrayList = new ArrayList(set.size());
                for (aeab aeab : set) {
                    int i3 = aeab.f62978b;
                    String valueOf = String.valueOf(aeab.f62977a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 14);
                    sb2.append(i3);
                    sb2.append("|<");
                    sb2.append(valueOf);
                    sb2.append(">");
                    arrayList.add(sb2.toString());
                }
                Set<Uri> b = mo47263b();
                ArrayList arrayList2 = new ArrayList(b.size());
                for (Uri uri : b) {
                    String valueOf2 = String.valueOf(uri);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                    sb3.append("<");
                    sb3.append(valueOf2);
                    sb3.append(">");
                    arrayList2.add(sb3.toString());
                }
                String join = TextUtils.join(charSequence, arrayList);
                String join2 = TextUtils.join(charSequence, arrayList2);
                StringBuilder sb4 = new StringBuilder(String.valueOf(join).length() + 30 + String.valueOf(join2).length());
                sb4.append("uris{observed=[");
                sb4.append(join);
                sb4.append("] triggered=[");
                sb4.append(join2);
                sb4.append("]}");
                str2 = sb4.toString();
            } else {
                str2 = "unknown{}";
            }
        }
        objArr[3] = str2;
        ArrayList arrayList3 = new ArrayList();
        int i4 = this.f84444n.f63121n;
        if (i4 == 0) {
            arrayList3.add("NET_CONNECTED");
        } else if (i4 != 1) {
            arrayList3.add("NET_ANY");
        } else {
            arrayList3.add("NET_UNMETERED");
        }
        if (this.f84444n.f63123p == 1) {
            arrayList3.add("CHARGING");
        }
        if (this.f84444n.f63125r == 1) {
            arrayList3.add("DEVICE_IDLE");
        }
        Set set2 = this.f84444n.f63118k;
        if (set2 != null && !set2.isEmpty()) {
            String valueOf3 = String.valueOf(TextUtils.join("|", this.f84444n.f63118k));
            arrayList3.add(valueOf3.length() == 0 ? new String("REACHABILITY_URIS:") : "REACHABILITY_URIS:".concat(valueOf3));
        }
        objArr[4] = TextUtils.join(charSequence, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        if (this.f84436f) {
            arrayList4.add("PERSISTED");
        }
        if (this.f84445o == 1) {
            arrayList4.add("RECURRING");
        }
        objArr[5] = TextUtils.join(charSequence, arrayList4);
        objArr[6] = Long.valueOf(j);
        objArr[7] = str;
        objArr[8] = str4;
        objArr[9] = apic.f84430a[this.f84442l];
        objArr[10] = Integer.valueOf(this.f84438h);
        int a3 = aaor.m21768a(this.f84440j.f28717b);
        if (a3 == 0) {
            a3 = 1;
        }
        if (a3 != 1) {
            str3 = a3 != 2 ? a3 != 3 ? a3 != 4 ? a3 != 5 ? "GMS_TASK_SCHEDULER" : "FIREBASE_JOB_DISPATCHER" : "MANCHEGO_GCM" : "LONGHORN_GCM" : "DEBUG_JOB";
        } else {
            str3 = "SOURCE_UNKNOWN";
        }
        objArr[11] = str3;
        objArr[12] = this.f84440j.f28718c;
        return String.format(locale, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s jid=%s status=%s retries=%d client_lib=%s-%s}", objArr);
    }

    /* renamed from: a */
    public static apid m70357a(apid apid, long j) {
        return new apid(apid, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo47258a(long j) {
        return (mo47270h() - j) / 1000;
    }

    /* renamed from: a */
    public final synchronized void mo47259a(Uri uri) {
        this.f84448r.add(uri);
    }

    /* renamed from: a */
    public final synchronized void mo47260a(Collection collection) {
        this.f84448r.addAll(collection);
    }

    /* renamed from: a */
    public final boolean mo47262a() {
        int a = aaor.m21768a(this.f84440j.f28717b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            return i != 3 ? i != 4 ? i == 5 : (this.f84440j.f28716a & 2) != 0 : mo47275l() >= 10400000;
        }
        return true;
    }

    private apid(apid apid, long j) {
        this(apid.f84444n, apid.f84445o, apid.f84431a, j);
        this.f84438h = apid.f84438h;
        this.f84435e = apid.f84435e;
        this.f84436f = apid.f84436f;
        this.f84440j = apid.f84440j;
        this.f84439i = apid.f84439i;
        if (cdnj.f181319a.mo6606a().mo77999c()) {
            this.f84437g = apid.f84437g;
        }
    }
}
