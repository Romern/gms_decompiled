package p000;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* renamed from: obh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obh extends obe {

    /* renamed from: a */
    public static obe f37124a;

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
        String name = oer.SENSOR_SOURCE.name();
        if (c == 0) {
            str2 = String.valueOf((int) c3);
            c2 = 0;
        } else {
            switch (c) {
                case 32769:
                    str3 = "SENSOR_MESSAGE_REQUEST";
                    break;
                case 32770:
                    str3 = "SENSOR_MESSAGE_RESPONSE";
                    break;
                case 32771:
                    str3 = "SENSOR_MESSAGE_BATCH";
                    break;
                default:
                    str3 = "SENSOR_MESSAGE_ERROR";
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
                biut biut = (biut) bxvk.m124013a(biut.f121870d, byteBuffer2, bxus.m123744c());
                if (biut != null) {
                    Object[] objArr = new Object[2];
                    biva a = biva.m102863a(biut.f121873b);
                    if (a == null) {
                        a = biva.SENSOR_LOCATION;
                    }
                    objArr[0] = a.name();
                    objArr[1] = Long.valueOf(biut.f121874c);
                    printWriter2.printf("%s:%d", objArr);
                    break;
                }
                break;
            case 32770:
                biuu biuu = (biuu) bxvk.m124013a(biuu.f121876b, byteBuffer2, bxus.m123744c());
                if (biuu != null) {
                    Object[] objArr2 = new Object[1];
                    bisf a2 = bisf.m102781a(biuu.f121878a);
                    if (a2 == null) {
                        a2 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    objArr2[0] = a2.name();
                    printWriter2.printf("%s", objArr2);
                    break;
                }
                break;
            case 32771:
                biup biup = (biup) bxvk.m124013a(biup.f121833w, byteBuffer2, bxus.m123744c());
                if (biup != null) {
                    printWriter2.printf("%s", biup);
                    break;
                }
                break;
            default:
                try {
                    biuq biuq = (biuq) bxvk.m124013a(biuq.f121858c, byteBuffer2, bxus.m123744c());
                    if (biuq != null) {
                        Object[] objArr3 = new Object[2];
                        biva a3 = biva.m102863a(biuq.f121860a);
                        if (a3 == null) {
                            a3 = biva.SENSOR_LOCATION;
                        }
                        objArr3[0] = a3.name();
                        bius a4 = bius.m102853a(biuq.f121861b);
                        if (a4 == null) {
                            a4 = bius.SENSOR_OK;
                        }
                        objArr3[1] = a4.name();
                        printWriter2.printf("%s:%s", objArr3);
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
