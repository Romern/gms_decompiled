package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: bcvn */
public final /* synthetic */ class bcvn implements Callable {

    /* renamed from: a */
    private final bcvt f105001a;

    /* renamed from: b */
    private final bcwr f105002b;

    /* renamed from: c */
    private final bctr f105003c;

    /* renamed from: d */
    private final ConversationId f105004d;

    /* renamed from: e */
    private final bcoh f105005e;

    public bcvn(bcvt bcvt, bcwr bcwr, bctr bctr, ConversationId conversationId, bcoh bcoh) {
        this.f105001a = bcvt;
        this.f105002b = bcwr;
        this.f105003c = bctr;
        this.f105004d = conversationId;
        this.f105005e = bcoh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcwl, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    public final Object call() {
        String str;
        byte[] bArr;
        byte[] bArr2;
        Throwable th;
        bcvt bcvt = this.f105001a;
        bcwr bcwr = this.f105002b;
        bctr bctr = this.f105003c;
        ConversationId conversationId = this.f105004d;
        bcoh bcoh = this.f105005e;
        bcvt.mo57601a();
        String b = bcwr.mo57623b();
        String path = Uri.parse(bcwr.mo57623b()).getPath();
        String str2 = bcvt.f105025d;
        String str3 = File.separator;
        String str4 = File.separator;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str2);
        sb.append(str3);
        sb.append("photos");
        sb.append(str4);
        if (!path.startsWith(new File(sb.toString()).getAbsolutePath())) {
            Context context = bcvt.f105023b;
            bcws bcws = bcvt.f105030i;
            byte[] a = bcvg.m90110a(context, Uri.parse(bcwr.mo57623b()), ((Integer) bbqt.m88417a(bcvt.f105023b).f103111aF.mo58455c()).intValue(), ((Integer) bbqt.m88417a(bcvt.f105023b).f103112aG.mo58455c()).intValue(), (long) Math.min(((Integer) bbqt.m88417a(bcvt.f105023b).f103110aE.mo58455c()).intValue(), bcwr.mo57628f()), ((Integer) bbqt.m88417a(bcvt.f105023b).f103153av.mo58455c()).intValue());
            File file = new File(bcvt.m90117a(bctr.mo57359a()));
            bcvt.mo57603b().mkdirs();
            String absolutePath = bcvt.mo57603b().getAbsolutePath();
            String str5 = File.separator;
            String a2 = bcvt.m90115a(conversationId.mo60498a());
            String a3 = bcvt.m90116a(conversationId);
            String name = file.getName();
            int length2 = String.valueOf(absolutePath).length();
            int length3 = String.valueOf(str5).length();
            int length4 = String.valueOf(a2).length();
            StringBuilder sb2 = new StringBuilder(length2 + 1 + length3 + length4 + String.valueOf(a3).length() + String.valueOf(name).length());
            sb2.append(absolutePath);
            sb2.append(str5);
            sb2.append(a2);
            sb2.append(a3);
            sb2.append("_");
            sb2.append(name);
            File file2 = new File(new File(sb2.toString()).getAbsolutePath());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(a);
                fileOutputStream.close();
                str = Uri.fromFile(file2.getAbsoluteFile()).toString();
                bArr = a;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                fileOutputStream.close();
                throw th3;
            }
        } else {
            InputStream a4 = bcvt.mo57599a(Uri.parse(bcwr.mo57623b()));
            try {
                byte[] a5 = boav.m111020a(a4);
                if (a4 != null) {
                    a4.close();
                }
                str = b;
                bArr = a5;
            } catch (Throwable th4) {
                bqye.m113761a(th, th4);
            }
        }
        if (bArr != null) {
            if (!bcwr.mo57624c().mo66813a()) {
                Context context2 = bcvt.f105023b;
                bcws bcws2 = bcvt.f105030i;
                byte[] a6 = bcvg.m90110a(context2, Uri.parse(bcwr.mo57623b()), ((Integer) bbqt.m88417a(bcvt.f105023b).f103108aC.mo58455c()).intValue(), ((Integer) bbqt.m88417a(bcvt.f105023b).f103109aD.mo58455c()).intValue(), (long) ((Integer) bbqt.m88417a(bcvt.f105023b).f103107aB.mo58455c()).intValue(), ((Integer) bbqt.m88417a(bcvt.f105023b).f103154aw.mo58455c()).intValue());
                if (a6 != null) {
                    bArr2 = a6;
                } else {
                    throw new IOException("Failed to generate thumbnail");
                }
            } else {
                bArr2 = (byte[]) bcwr.mo57624c().mo66814b();
            }
            bcwq h = bcwr.mo57630h();
            h.mo57639a(bArr2);
            h.f105080b = str;
            bcwr a7 = h.mo57637a();
            bcte n = bctr.mo57374n();
            bctg c = bcth.m89920c();
            c.mo57523a("photos");
            c.mo57524a((byte[]) bcva.m90100a(a7).mo66814b());
            n.mo57504a(c.mo57522a());
            bcvt.f105027f.mo56561a(bcoh).mo56643b(n.mo57502a());
            bcwe bcwe = bcvt.f105024c;
            bcei c2 = bcej.m88869c();
            c2.f104034a = "ScottyUpload";
            c2.mo56735a(bcen.f104044e);
            bcej a8 = c2.mo56734a();
            bcfx bcfx = bcwe.f105050c;
            bcnr q = bcns.m89409q();
            q.mo57011b(28);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b(bctr.mo57359a());
            q.mo57008a(bctr.mo57361c());
            bcfx.mo56753a(q.mo57002a());
            bcjm bcjm = bcwe.f105048a;
            UUID randomUUID = UUID.randomUUID();
            bcwl bcwl = new bcwl(bcoh, conversationId, bArr);
            Context context3 = bcwe.f105049b;
            bqgg a9 = bcjm.mo56941a(randomUUID, (bcnl) bcwl, bqga.m112775a(new bcwa(context3, new bcwg(context3, null))), bcoh, a8, true);
            bqga.m112781a(a9, new bcwd(bcwe, bcoh, bctr), bqfb.INSTANCE);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            int length5 = bArr.length;
            BitmapFactory.decodeByteArray(bArr, 0, length5, options);
            int i = options.outHeight;
            int i2 = options.outWidth;
            bcwq h2 = bcwr.mo57630h();
            h2.f105079a = ((bcvz) a9.get()).mo57609a();
            h2.mo57639a(bArr2);
            h2.mo57642d(i2);
            h2.mo57640b(i);
            h2.mo57641c(length5);
            h2.f105080b = str;
            bcwr a10 = h2.mo57637a();
            bcte n2 = bctr.mo57374n();
            bctg c3 = bcth.m89920c();
            c3.mo57523a("photos");
            c3.mo57524a((byte[]) bcva.m90100a(a10).mo66814b());
            n2.mo57504a(c3.mo57522a());
            bctr a11 = n2.mo57502a();
            bcvt.f105027f.mo56561a(bcoh).mo56643b(a11);
            return a11;
        }
        throw new IOException("Failed to compress image");
        throw th;
    }
}
