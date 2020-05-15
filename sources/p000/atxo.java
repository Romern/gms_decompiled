package p000;

import android.os.Message;

/* renamed from: atxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxo {
    /* renamed from: a */
    public static bxxc m76510a(Message message, String str, bxxc bxxc) {
        byte[] byteArray = message.getData().getByteArray(str);
        if (byteArray != null) {
            return (bxxc) bxxc.mo74143cZ().mo73657a(byteArray);
        }
        throw new bxwf("bytes is null");
    }

    /* renamed from: b */
    public static bxxc m76511b(Message message, String str, bxxc bxxc) {
        byte[] byteArray = message.getData().getByteArray(str);
        if (byteArray != null) {
            return (bxxc) ((bxxk) ((GeneratedMessageLite) bxxc).mo74142c(7)).mo73657a(byteArray);
        }
        return null;
    }
}
