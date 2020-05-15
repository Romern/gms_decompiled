package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: cej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cej extends cef {

    /* renamed from: a */
    private static final UriMatcher f6612a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6612a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f6612a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f6612a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f6612a.addURI("com.android.contacts", "contacts/#", 3);
        f6612a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f6612a.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public cej(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    private static final InputStream m4066a(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3748a(Uri uri, ContentResolver contentResolver) {
        InputStream inputStream;
        int match = f6612a.match(uri);
        if (match != 1) {
            if (match == 3) {
                inputStream = m4066a(contentResolver, uri);
            } else if (match != 5) {
                inputStream = contentResolver.openInputStream(uri);
            }
            if (inputStream == null) {
                return inputStream;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("InputStream is null for ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            inputStream = m4066a(contentResolver, lookupContact);
            if (inputStream == null) {
            }
        } else {
            throw new FileNotFoundException("Contact cannot be found");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3749a(Object obj) {
        ((InputStream) obj).close();
    }
}
