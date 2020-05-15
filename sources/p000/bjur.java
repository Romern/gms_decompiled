package p000;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: bjur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjur {

    /* renamed from: a */
    public final String f123365a;

    /* renamed from: b */
    public final List f123366b;

    public bjur(String str, String... strArr) {
        this.f123365a = str;
        this.f123366b = Arrays.asList(strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo65551a() {
        if (this.f123366b.isEmpty()) {
            return this.f123365a.concat(".json");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f123366b) {
            arrayList.add(JSONObject.quote(str));
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            try {
                instance.update(bmxr.m108544a(", ").mo66874a((Iterable) arrayList).toString().getBytes("UTF-8"));
                return String.format("%s-%s.json", this.f123365a, srv.m36164d(instance.digest()));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
