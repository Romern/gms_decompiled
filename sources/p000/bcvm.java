package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: bcvm */
public final /* synthetic */ class bcvm implements Callable {

    /* renamed from: a */
    private final bcvt f104999a;

    /* renamed from: b */
    private final bcoh f105000b;

    public bcvm(bcvt bcvt, bcoh bcoh) {
        this.f104999a = bcvt;
        this.f105000b = bcoh;
    }

    public final Object call() {
        bcvt bcvt = this.f104999a;
        bnre i = this.f105000b.mo57058b().mo57075f().listIterator();
        boolean z = true;
        while (i.hasNext()) {
            ContactId contactId = (ContactId) i.next();
            String str = bcvt.f105025d;
            String str2 = File.separator;
            String str3 = File.separator;
            String b = bcvt.m90118b(contactId);
            String str4 = File.separator;
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(b).length() + String.valueOf(str4).length());
            sb.append(str);
            sb.append(str2);
            sb.append("photos");
            sb.append(str3);
            sb.append(b);
            sb.append(str4);
            File file = new File(sb.toString());
            if (file.exists()) {
                z = z && bcvt.mo57602a(file, null);
            }
            String str5 = bcvt.f105025d;
            String str6 = File.separator;
            String str7 = File.separator;
            String str8 = bcvt.f105026e;
            String str9 = File.separator;
            int length2 = String.valueOf(str5).length();
            StringBuilder sb2 = new StringBuilder(length2 + 6 + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length());
            sb2.append(str5);
            sb2.append(str6);
            sb2.append("photos");
            sb2.append(str7);
            sb2.append(str8);
            sb2.append(str9);
            File file2 = new File(sb2.toString());
            if (file2.exists()) {
                z = z && bcvt.mo57602a(file2, bcvt.m90118b(contactId));
            }
        }
        return Boolean.valueOf(z);
    }
}
