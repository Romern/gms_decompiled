package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: azrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azrl implements aztx {

    /* renamed from: a */
    public final Context f99944a;

    /* renamed from: b */
    public final azew f99945b;

    /* renamed from: c */
    public final azed f99946c;

    public azrl(Context context, azew azew, azed azed) {
        this.f99944a = context.getApplicationContext();
        this.f99945b = azew;
        this.f99946c = azed;
    }

    /* renamed from: a */
    public final void mo54821a(String str) {
        azph.m85998a(this.f99944a).mo55165b(1937);
        try {
            byte[] bytes = str.getBytes();
            if (((long) bytes.length) > cfgs.f183989a.mo6606a().mo81156L()) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                new azoq(byteArrayInputStream, new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1])).start();
                this.f99945b.mo54852a(parcelFileDescriptor);
                azph.m85998a(this.f99944a).mo55125a(1931);
                return;
            }
            this.f99945b.mo54853a(str);
            azph.m85998a(this.f99944a).mo55125a(1920);
        } catch (IOException e) {
            azoj.m85933c("LWAIDLCallback", "Failed to write to output stream.", new Object[0]);
            azph.m85998a(this.f99944a).mo55135a(1930, 65, str, (ConversationId) null);
        } catch (TransactionTooLargeException e2) {
            azoj.m85931a("LWAIDLCallback", e2, "Unable to send JS callback to UI process listener", new Object[0]);
            azph.m85998a(this.f99944a).mo55135a(1928, 65, str, (ConversationId) null);
        } catch (RemoteException e3) {
            azoj.m85931a("LWAIDLCallback", e3, "Unable to send JS callback to UI process listener", new Object[0]);
            azed azed = this.f99946c;
            azph.m85998a(azed.f99146a).mo55125a(1925);
            azed.f99147b.mo54821a(str);
            azph.m85998a(this.f99944a).mo55135a(1914, 65, str, (ConversationId) null);
        }
    }

    /* renamed from: a */
    public final void mo54822a(String[] strArr) {
        throw null;
    }
}
