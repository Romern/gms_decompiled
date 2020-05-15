package p000;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: abye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abye {
    /* renamed from: a */
    private static Intent m48531a(ActionImpl actionImpl) {
        Uri parse = Uri.parse(actionImpl.f152343c);
        String host = parse.getHost();
        if (host == null) {
            host = "";
        }
        if (!host.isEmpty()) {
            return new Intent("android.intent.action.VIEW", parse);
        }
        String valueOf = String.valueOf(parse);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 98);
        sb.append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static UsageInfo m48534b(ActionImpl actionImpl, long j, String str) {
        ftb a = m48533a(actionImpl, j, m48531a(actionImpl));
        a.f17216e = true;
        a.f17212a = new DocumentId("com.google.android.gms", str, actionImpl.f152343c);
        return a.mo11301a();
    }

    /* renamed from: a */
    public static UsageInfo m48532a(ActionImpl actionImpl, long j, String str) {
        Intent a = m48531a(actionImpl);
        ftb a2 = m48533a(actionImpl, j, a);
        String uri = a.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(uri.getBytes("UTF-8"));
            a2.f17212a = new DocumentId(str, "", Long.toHexString(crc32.getValue()));
            return a2.mo11301a();
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private static ftb m48533a(ActionImpl actionImpl, long j, Intent intent) {
        String string;
        int i = !actionImpl.f152345e.f152353f ? 5 : 4;
        String str = actionImpl.f152344d;
        DocumentSection[] documentSectionArr = null;
        Uri parse = str != null ? Uri.parse(str) : null;
        String str2 = actionImpl.f152342b;
        fqv fqv = new fqv();
        fqv.mo11173a(UsageInfo.m6158a(str2));
        if (parse != null) {
            fqv.mo11173a(UsageInfo.m6157a(parse));
        }
        String action = intent.getAction();
        if (action != null) {
            fqv.mo11173a(UsageInfo.m6159a("intent_action", action));
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            fqv.mo11173a(UsageInfo.m6159a("intent_data", dataString));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            fqv.mo11173a(UsageInfo.m6159a("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (!(extras == null || (string = extras.getString("intent_extra_data_key")) == null)) {
            fqv.mo11173a(UsageInfo.m6159a("intent_extra_data", string));
        }
        byte[] bArr = actionImpl.f152345e.f152352e;
        if (bArr != null && bArr.length > 0) {
            fqv.mo11173a(new DocumentSection(bArr, DocumentSection.f9542b));
        }
        String str3 = actionImpl.f152345e.f152351d;
        if (str3 != null && !str3.isEmpty()) {
            fqv.f17148b = new Account(str3, "com.google");
        }
        fud fud = new fud();
        String str4 = actionImpl.f152342b;
        sdo.m34959a((Object) str4);
        fud.mo11341b("name", str4);
        Uri parse2 = Uri.parse(actionImpl.f152343c);
        sdo.m34959a(parse2);
        fud.mo11341b("url", parse2.toString());
        String str5 = actionImpl.f152344d;
        if (str5 != null) {
            fud.mo11341b("id", str5);
        }
        String valueOf = String.valueOf(actionImpl.f152341a);
        fub fub = new fub(valueOf.length() == 0 ? new String("http://schema.org/") : "http://schema.org/".concat(valueOf));
        fue fue = new fue(fud.f17254a);
        sdo.m34959a(fue);
        sdo.m34959a((Object) "object");
        fub.f17254a.putParcelable("object", fue.f17255a);
        String str6 = actionImpl.f152346f;
        if (str6 != null) {
            fub.mo11336a(str6);
        }
        String str7 = actionImpl.f152345e.f152350c;
        if (str7 != null) {
            fub.mo11337a("completionToken", str7);
        }
        Bundle bundle = new Bundle();
        bundle.putAll(actionImpl.f152347g);
        sdo.checkIfNull(fub.f17254a.get("object"), "setObject is required before calling build().");
        sdo.checkIfNull(fub.f17254a.get("type"), "setType is required before calling build().");
        Bundle bundle2 = (Bundle) fub.f17254a.getParcelable("object");
        sdo.checkIfNull(bundle2.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
        sdo.checkIfNull(bundle2.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
        bundle.putAll(new fue(fub.f17254a).f17255a);
        fqv.mo11173a(ftr.m12361a(".private:action", ftr.m12360a(bundle)));
        ftb ftb = new ftb();
        ftb.f17213b = j;
        ftb.f17214c = i;
        ftb.f17218g = actionImpl.f152341a;
        Account account = fqv.f17148b;
        List list = fqv.f17147a;
        if (list != null) {
            documentSectionArr = (DocumentSection[]) list.toArray(new DocumentSection[list.size()]);
        }
        ftb.f17215d = new DocumentContents(account, documentSectionArr);
        ActionImpl.MetadataImpl metadataImpl = actionImpl.f152345e;
        ftb.f17216e = !metadataImpl.f152349b;
        ftb.f17217f = metadataImpl.f152348a;
        return ftb;
    }
}
