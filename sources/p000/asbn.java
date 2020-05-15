package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.util.EntityUtils;

/* renamed from: asbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbn {

    /* renamed from: a */
    public static final Logger f88672a = new Logger("D2D", "WifiBackupServerManager");

    /* renamed from: b */
    public final Context f88673b;

    /* renamed from: c */
    private final abop f88674c;

    public asbn(Context context) {
        abop abop = new abop(context, "Android-Backup/1.0", false);
        Logger Logger = asbq.f88679a;
        this.f88673b = context;
        this.f88674c = abop;
    }

    /* renamed from: a */
    public static final String m73754a(Context context, Account account) {
        try {
            String c = asbs.m73758a(context).mo33924c(account, "android");
            if (c != null) {
                return c;
            }
            throw new AuthenticatorException("No Auth Token");
        } catch (OperationCanceledException e) {
            f88672a.mo25417e("OperationCanceledException in getAuthToken", e, new Object[0]);
            return null;
        } catch (IOException e2) {
            f88672a.mo25417e("IOException in getAuthToken", e2, new Object[0]);
            return null;
        } catch (AuthenticatorException e3) {
            f88672a.mo25417e("AuthenticatorException in getAuthToken", e3, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final ltq mo49031a(lth lth) {
        if (lth == null) {
            f88672a.mo25418e("backupRequest was null; not performing executeBackupRequestBlocking.", new Object[0]);
            return null;
        }
        shr.m35316b(1029);
        try {
            byte[] k = lth.serializeToBytes();
            HttpPost httpPost = new HttpPost(maa.m24747a(this.f88673b));
            httpPost.setHeader("Content-Type", "application/octet-stream");
            httpPost.setEntity(new ByteArrayEntity(k));
            HttpResponse execute = this.f88674c.execute(httpPost);
            HttpEntity entity = execute.getEntity();
            if (execute.getStatusLine().getStatusCode() == 503) {
                f88672a.logVerbose("Sc Service Unavailable", new Object[0]);
                shr.m35312a();
                return null;
            } else if (execute.getStatusLine().getStatusCode() != 200) {
                if (entity != null) {
                    entity.consumeContent();
                }
                String valueOf = String.valueOf(EntityUtils.toString(execute.getEntity()));
                throw new IOException(valueOf.length() == 0 ? new String("Server rejected backup: ") : "Server rejected backup: ".concat(valueOf));
            } else if (entity != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                ltq ltq = (ltq) GeneratedMessageLite.m124016a(ltq.f32971i, byteArrayOutputStream.toByteArray(), bxus.m123744c());
                shr.m35312a();
                return ltq;
            } else {
                throw new IOException("Missing response body");
            }
        } catch (UnknownHostException e) {
            f88672a.mo25417e("No connection", e, new Object[0]);
        } catch (IOException e2) {
            f88672a.mo25417e("IOException", e2, new Object[0]);
        } catch (Throwable th) {
            shr.m35312a();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo49032a(String str, asbm asbm) {
        new Thread(new asbl(this, str, asbm)).start();
    }
}
