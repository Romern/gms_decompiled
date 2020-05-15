package p000;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* renamed from: obf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obf extends obe {

    /* renamed from: a */
    public static obe f37122a;

    /* renamed from: a */
    public final void mo21936a(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        char c;
        char c2;
        String str2;
        String str3;
        ByteBuffer byteBuffer2 = byteBuffer;
        PrintWriter printWriter2 = printWriter;
        char c3 = (char) byteBuffer.getShort();
        switch (c3) {
            case 32769:
                c = 32769;
                break;
            case 32770:
                c = 32770;
                break;
            case 32771:
                c = 32771;
                break;
            case 32772:
                c = 32772;
                break;
            default:
                c = 0;
                break;
        }
        String name = oer.INPUT_SOURCE.name();
        if (c == 0) {
            str2 = String.valueOf((int) c3);
            c2 = 0;
        } else {
            switch (c) {
                case 32769:
                    str3 = "INPUT_MESSAGE_INPUT_REPORT";
                    break;
                case 32770:
                    str3 = "INPUT_MESSAGE_KEY_BINDING_REQUEST";
                    break;
                case 32771:
                    str3 = "INPUT_MESSAGE_KEY_BINDING_RESPONSE";
                    break;
                default:
                    str3 = "INPUT_MESSAGE_INPUT_FEEDBACK";
                    break;
            }
            c2 = c;
            str2 = str3;
        }
        m28338a(str, j, name, z, str2, byteBuffer, printWriter);
        if (c2 == 0) {
            printWriter.println();
            printWriter2.printf("Received unexpected message of type %d\n", Integer.valueOf(c3));
            return;
        }
        printWriter2.print(":{");
        switch (c2) {
            case 32769:
                birc birc = (birc) GeneratedMessageLite.m124013a(birc.f121379g, byteBuffer2, bxus.m123744c());
                if (birc != null) {
                    printWriter2.printf("%s", birc);
                    break;
                }
                break;
            case 32770:
                birm birm = (birm) GeneratedMessageLite.m124013a(birm.f121425b, byteBuffer2, bxus.m123744c());
                if (birm != null) {
                    printWriter2.printf("%s", birm.f121427a);
                    break;
                }
                break;
            case 32771:
                birn birn = (birn) GeneratedMessageLite.m124013a(birn.f121428b, byteBuffer2, bxus.m123744c());
                if (birn != null) {
                    printWriter2.printf("%d", Integer.valueOf(birn.f121430a));
                    break;
                }
                break;
            default:
                try {
                    birb birb = (birb) GeneratedMessageLite.m124013a(birb.f121375c, byteBuffer2, bxus.m123744c());
                    if (birb != null) {
                        Object[] objArr = new Object[1];
                        biqh a = biqh.m102724a(birb.f121378b);
                        if (a == null) {
                            a = biqh.FEEDBACK_SELECT;
                        }
                        objArr[0] = Integer.valueOf(a.f121281f);
                        printWriter2.printf("%d", objArr);
                        break;
                    }
                } catch (bxwf e) {
                    break;
                }
                break;
        }
        printWriter2.println("}");
    }
}
