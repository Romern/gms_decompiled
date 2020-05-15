package p000;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* renamed from: obi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obi extends obg {

    /* renamed from: a */
    public static obe f37125a;

    public obi() {
        super(oer.VIDEO_SINK);
    }

    /* renamed from: a */
    public final void mo21936a(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        String str2;
        PrintWriter printWriter2 = printWriter;
        ByteBuffer duplicate = byteBuffer.duplicate();
        char c = (char) duplicate.getShort();
        int b = birw.m102772b(c);
        int i = 1;
        if (b != 0) {
            switch (b - 1) {
                case 32775:
                    m28338a(str, j, oer.VIDEO_SINK.name(), z, birw.m102771a(b), duplicate, printWriter);
                    printWriter2.print(":{");
                    biwm biwm = (biwm) GeneratedMessageLite.m124013a(biwm.f122109d, duplicate, bxus.m123744c());
                    if (biwm != null) {
                        Object[] objArr = new Object[2];
                        int b2 = biwi.m102902b(biwm.f122112b);
                        if (b2 == 0) {
                            b2 = 1;
                        }
                        objArr[0] = biwi.m102901a(b2);
                        int a = biwl.m102905a(biwm.f122113c);
                        if (a == 0) {
                            a = 1;
                        }
                        if (a != 1) {
                            str2 = a != 2 ? "LAUNCH_NATIVE" : "PHONE_SCREEN_OFF";
                        } else {
                            str2 = "UNKNOWN";
                        }
                        objArr[1] = str2;
                        printWriter2.printf("%s:%s", objArr);
                        break;
                    }
                    break;
                case 32776:
                    m28338a(str, j, oer.VIDEO_SINK.name(), z, birw.m102771a(b), duplicate, printWriter);
                    printWriter2.print(":{");
                    biwj biwj = (biwj) GeneratedMessageLite.m124013a(biwj.f122103c, duplicate, bxus.m123744c());
                    if (biwj != null) {
                        Object[] objArr2 = new Object[1];
                        int b3 = biwi.m102902b(biwj.f122105a);
                        if (b3 != 0) {
                            i = b3;
                        }
                        objArr2[0] = biwi.m102901a(i);
                        printWriter2.printf("%s", objArr2);
                        break;
                    }
                    break;
                default:
                    try {
                        super.mo21936a(str, j, z, byteBuffer, printWriter);
                        return;
                    } catch (bxwf e) {
                        break;
                    }
            }
            printWriter2.println("}");
            return;
        }
        m28338a(str, j, oer.VIDEO_SINK.name(), z, String.valueOf((int) c), duplicate, printWriter);
        printWriter.println();
        printWriter2.printf("Received unexpected message of type %d", Integer.valueOf(c));
        printWriter.println();
    }
}
