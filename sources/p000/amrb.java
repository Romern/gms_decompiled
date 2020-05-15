package p000;

import android.view.View;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: amrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amrb extends soa {

    /* renamed from: a */
    final /* synthetic */ View f75793a;

    /* renamed from: b */
    final /* synthetic */ amrc f75794b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amrb(amrc amrc, View view) {
        super(9);
        this.f75794b = amrc;
        this.f75793a = view;
    }

    public final void run() {
        ArrayList arrayList;
        int i;
        String concat = String.valueOf(this.f75794b.f75795a.f74294c).concat(".USER_INITIATED_FEEDBACK_REPORT");
        wwu wwu = new wwu();
        wwu.f51499d = concat;
        amdk.m62656a("DebugUploadButtonListener", "Begin data capture for uploader '%s'", this.f75794b.f75795a.f74292a);
        amdk.m62656a("DebugUploadButtonListener", "Feedback Category = %s", concat);
        amig.m62939a();
        if (Boolean.valueOf(cfvh.f185774a.mo6606a().mo82773a()).booleanValue()) {
            amrc amrc = this.f75794b;
            alud alud = amrc.f75795a;
            rkb rkb = amrc.f75796b;
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            bnre i2 = alud.mo40789a().listIterator();
            int i3 = 0;
            while (i2.hasNext()) {
                alub alub = (alub) i2.next();
                try {
                    alua a = alub.mo40783a(rkb);
                    int a2 = a.mo40779a();
                    if (a2 != -1) {
                        arrayList2.add(a);
                        i3 += a2;
                    }
                    try {
                        Map c = a.mo40782c();
                        if (c != null) {
                            String concat2 = String.valueOf(alub.mo40784a()).concat("_");
                            for (Map.Entry entry : c.entrySet()) {
                                String valueOf = String.valueOf(concat2);
                                String valueOf2 = String.valueOf((String) entry.getKey());
                                arrayList.add(aluh.m61891a(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), (String) entry.getValue()));
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        bqye.m113760a(e, new PrintWriter(new StringWriter()));
                        new Object[1][0] = alub.mo40784a();
                        arrayList.add(alud.m61880a(e, alub.mo40784a()));
                    }
                } catch (Exception e2) {
                    e = e2;
                    bqye.m113760a(e, new PrintWriter(new StringWriter()));
                    new Object[1][0] = alub.mo40784a();
                    arrayList.add(alud.m61880a(e, alub.mo40784a()));
                }
            }
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                if (i3 >= 7340032) {
                    int i4 = i3 / size;
                    i = 7340032 / size;
                } else {
                    i = Integer.MAX_VALUE;
                }
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    alua alua = (alua) arrayList2.get(i5);
                    try {
                        arrayList.add(aluh.m61892a(alua.mo40781b(), alua.mo40780a(i)));
                        if (alua.mo40779a() > i) {
                            arrayList.add(aluh.m61891a(String.valueOf(alua.mo40781b()).concat("_original_size"), Integer.toString(alua.mo40779a())));
                        }
                    } catch (Exception e3) {
                        new Object[1][0] = alua.mo40781b();
                        arrayList.add(alud.m61880a(e3, alua.mo40781b()));
                    }
                }
            }
        } else {
            amrc amrc2 = this.f75794b;
            alud alud2 = amrc2.f75795a;
            rkb rkb2 = amrc2.f75796b;
            arrayList = new ArrayList();
            bnre i6 = alud2.mo40789a().listIterator();
            while (i6.hasNext()) {
                alub alub2 = (alub) i6.next();
                try {
                    try {
                        arrayList.add(aluh.m61892a(alub2.mo40784a(), alub2.mo40783a(rkb2).mo40780a(Integer.MAX_VALUE)));
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    StringWriter stringWriter = new StringWriter();
                    bqye.m113760a(e, new PrintWriter(stringWriter));
                    new Object[1][0] = alub2.mo40784a();
                    arrayList.add(aluh.m61891a(String.valueOf(alub2.mo40784a()).concat("_error"), stringWriter.toString()));
                }
            }
        }
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            aluh aluh = (aluh) arrayList.get(i7);
            String str = aluh.f74301b;
            if (str != null) {
                wwu.mo29492a(aluh.f74300a, str);
                amdk.m62657a("DebugUploadButtonListener", "Text PSD: %s=%s", aluh.f74300a, aluh.f74301b);
            } else {
                byte[] bArr = aluh.f74302c;
                if (bArr != null) {
                    String str2 = aluh.f74300a;
                    wwu.mo29495a(false);
                    wwu.f51500e.add(new FileTeleporter(bArr, "text/plain", str2));
                    amdk.m62657a("DebugUploadButtonListener", "Binary PSD len: %s=%s", aluh.f74300a, Integer.valueOf(aluh.f74302c.length));
                }
            }
        }
        amdk.m62656a("DebugUploadButtonListener", "Capture for uploader '%s' finished", this.f75794b.f75795a.f74292a);
        this.f75793a.post(new amra(this, wwu.mo29490a()));
    }
}
