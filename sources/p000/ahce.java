package p000;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ahce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahce {

    /* renamed from: a */
    private static final Pattern f66982a = Pattern.compile("^(.*)\\((\\d+)\\)$");

    /* renamed from: a */
    static byte[] m55451a(String str, String str2, byte b) {
        if (TextUtils.isEmpty(str2)) {
            Matcher matcher = f66982a.matcher(str);
            if (matcher.find()) {
                str = matcher.group(1).trim();
                str2 = matcher.group(2);
            } else {
                str2 = "0000";
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Name and description must not be null");
        } else if (str2.length() > 4 || !TextUtils.isDigitsOnly(str2)) {
            throw new IllegalArgumentException("Invalid description");
        } else {
            byte[] bytes = str.getBytes();
            short parseShort = Short.parseShort(str2);
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 3);
            allocate.put((byte) (b + 32));
            allocate.putShort(parseShort);
            allocate.put(bytes);
            return allocate.array();
        }
    }
}
