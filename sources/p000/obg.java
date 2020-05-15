package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* renamed from: obg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class obg extends obe {

    /* renamed from: a */
    private final oer f37123a;

    public obg(oer oer) {
        this.f37123a = oer;
    }

    /* renamed from: a */
    public void mo21936a(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        int i;
        String str2;
        ByteBuffer byteBuffer2 = byteBuffer;
        PrintWriter printWriter2 = printWriter;
        char c = (char) byteBuffer.getShort();
        int b = birw.m102772b(c);
        String name = this.f37123a.name();
        if (b != 0) {
            i = b;
            str2 = birw.m102771a(b);
        } else {
            str2 = String.valueOf((int) c);
            i = 0;
        }
        m28338a(str, j, name, z, str2, byteBuffer, printWriter);
        if (i == 0) {
            printWriter.println();
            printWriter2.printf("Received unexpected message of type %d", Integer.valueOf(c));
            printWriter.println();
            return;
        }
        printWriter2.print(":{");
        int i2 = i - 1;
        if (i2 != 1) {
            switch (i2) {
                case AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT /*32768*/:
                    bivf bivf = (bivf) bxvk.m124013a(bivf.f121970c, byteBuffer2, bxus.m123744c());
                    if (bivf != null) {
                        birv a = birv.m102768a(bivf.f121973b);
                        if (a == null) {
                            a = birv.MEDIA_CODEC_AUDIO_PCM;
                        }
                        printWriter2.print(a.name());
                        break;
                    }
                    break;
                case 32769:
                    bivh bivh = (bivh) bxvk.m124013a(bivh.f121982d, byteBuffer2, bxus.m123744c());
                    if (bivh != null) {
                        printWriter2.printf("%d:%d", Integer.valueOf(bivh.f121985b), Integer.valueOf(bivh.f121986c));
                        break;
                    }
                    break;
                case 32770:
                    break;
                case 32771:
                    bipu bipu = (bipu) bxvk.m124013a(bipu.f121213d, byteBuffer2, bxus.m123744c());
                    if (bipu != null) {
                        printWriter2.printf("%d", Integer.valueOf(bipu.f121216b));
                        break;
                    }
                    break;
                case 32772:
                    biom biom = (biom) bxvk.m124013a(biom.f121063d, byteBuffer2, bxus.m123744c());
                    if (biom != null) {
                        printWriter2.printf("%d:%d", Integer.valueOf(biom.f121066b), Integer.valueOf(((Integer) ooe.m29303a(Integer.valueOf(biom.f121067c)).mo22383a((Object) 0)).intValue()));
                        break;
                    }
                    break;
                default:
                    try {
                        printWriter2.printf("Received unexpected MediaMessageId %s", birw.m102771a(i));
                        break;
                    } catch (bxwf e) {
                        break;
                    }
            }
        }
        printWriter2.println("}");
    }
}
