package p000;

import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;

/* renamed from: bcvq */
final /* synthetic */ class bcvq implements bmxj {

    /* renamed from: a */
    private final bcvt f105012a;

    /* renamed from: b */
    private final String f105013b;

    /* renamed from: c */
    private final bctr f105014c;

    /* renamed from: d */
    private final bcwr f105015d;

    /* renamed from: e */
    private final bcoh f105016e;

    public bcvq(bcvt bcvt, String str, bctr bctr, bcwr bcwr, bcoh bcoh) {
        this.f105012a = bcvt;
        this.f105013b = str;
        this.f105014c = bctr;
        this.f105015d = bcwr;
        this.f105016e = bcoh;
    }

    public final Object apply(Object obj) {
        bcvt bcvt = this.f105012a;
        String str = this.f105013b;
        bctr bctr = this.f105014c;
        bcwr bcwr = this.f105015d;
        bcoh bcoh = this.f105016e;
        bcvx bcvx = (bcvx) obj;
        ConversationId c = bctr.mo57361c();
        File file = new File(str);
        bcvt.mo57603b().mkdirs();
        String absolutePath = bcvt.mo57603b().getAbsolutePath();
        String str2 = File.separator;
        String a = bcvt.m90115a(c.mo60498a());
        String a2 = bcvt.m90116a(c);
        String name = file.getName();
        int length = String.valueOf(absolutePath).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(a).length();
        bcoh bcoh2 = bcoh;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + length3 + String.valueOf(a2).length() + String.valueOf(name).length());
        sb.append(absolutePath);
        sb.append(str2);
        sb.append(a);
        sb.append(a2);
        sb.append("_");
        sb.append(name);
        File file2 = new File(sb.toString());
        file.renameTo(file2);
        String absolutePath2 = file2.getAbsolutePath();
        bmxv c2 = bcwr.mo57624c();
        if (!c2.mo66813a()) {
            byte[] a3 = bcvg.m90110a(bcvt.f105023b, Uri.fromFile(new File(absolutePath2)), ((Integer) bbqt.m88417a(bcvt.f105023b).f103108aC.mo58455c()).intValue(), ((Integer) bbqt.m88417a(bcvt.f105023b).f103109aD.mo58455c()).intValue(), (long) ((Integer) bbqt.m88417a(bcvt.f105023b).f103107aB.mo58455c()).intValue(), ((Integer) bbqt.m88417a(bcvt.f105023b).f103154aw.mo58455c()).intValue());
            if (a3 == null) {
                bbos.m88294d("PhotosMsgController", "Failed to regenerate thumbnail");
            } else {
                c2 = bmxv.m108566b(a3);
            }
        }
        bcwq h = bcwr.mo57630h();
        h.f105080b = Uri.fromFile(new File(absolutePath2)).toString();
        h.mo57638a(1);
        if (c2 != null) {
            h.f105081c = c2;
            bcwr a4 = h.mo57637a();
            bcte n = bctr.mo57374n();
            bctg c3 = bcth.m89920c();
            c3.mo57523a("photos");
            c3.mo57524a((byte[]) bcva.m90100a(a4).mo66814b());
            n.mo57504a(c3.mo57522a());
            bctr a5 = n.mo57502a();
            bcvt.f105027f.mo56561a(bcoh2).mo56643b(a5);
            return a5;
        }
        throw new NullPointerException("Null thumbnail");
    }
}
