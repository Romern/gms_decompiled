package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.message.BasicHeader;

/* renamed from: bixi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixi {

    /* renamed from: a */
    private static final int f122198a = ".".codePointAt(0);

    /* renamed from: b */
    private static final String[] f122199b = {"google.com", "googleapis.com"};

    /* renamed from: c */
    private static final Pattern f122200c = Pattern.compile("[^,;\\s\"]+");

    /* renamed from: d */
    private static final Pattern f122201d = Pattern.compile("(^|[\\s;,]+)([^()<>@,;:\\\"/\\[\\]\\?={}\\s]+)\\s*=\\s*(\"[^\"]*\"|[^,;\\s\"]+)");

    /* renamed from: a */
    public static String m102932a(String str) {
        if (str == null) {
            return "\"\"";
        }
        if (f122200c.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m102937b(HttpUriRequest httpUriRequest, bixj bixj) {
        if (bixj != null) {
            String[] strArr = f122199b;
            for (String str : strArr) {
                String host = httpUriRequest.getURI().getHost();
                if (str.length() <= host.length()) {
                    if (str.equalsIgnoreCase(host)) {
                        return true;
                    }
                    int length = host.length() - 1;
                    int length2 = str.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            if (Character.toLowerCase(host.codePointAt(length)) != Character.toLowerCase(str.codePointAt(length2))) {
                                break;
                            }
                            length--;
                            length2--;
                        } else if (host.codePointAt(length) == f122198a) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m102933a(String str, String str2) {
        Matcher matcher = f122201d.matcher(str);
        while (matcher.find()) {
            if (matcher.group(2).equals(str2)) {
                String group = matcher.group();
                String trim = group.substring(group.indexOf("=") + 1).trim();
                return trim.startsWith("\"") ? trim.substring(1, trim.length() - 1) : trim;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static HttpUriRequest m102934a(HttpUriRequest httpUriRequest, bixj bixj) {
        int i;
        if (!m102937b(httpUriRequest, bixj)) {
            return httpUriRequest;
        }
        String a = bixj.mo24524a();
        String b = bixj.mo24526b();
        HttpUriRequest httpUriRequest2 = httpUriRequest;
        Header[] headers = httpUriRequest2.getHeaders("Cookie");
        int length = headers.length;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            Header header = headers[i2];
            Matcher matcher = f122201d.matcher(header.getValue());
            while (true) {
                if (!matcher.find()) {
                    break;
                }
                int i4 = 2;
                if (matcher.group(2).equals(a)) {
                    if (!z && !(httpUriRequest2 instanceof RequestWrapper)) {
                        httpUriRequest2 = m102935a(httpUriRequest2);
                    }
                    httpUriRequest2.removeHeader(header);
                    String name = header.getName();
                    Matcher matcher2 = f122201d.matcher(header.getValue());
                    StringBuffer stringBuffer = new StringBuffer();
                    while (matcher2.find()) {
                        if (matcher2.group(i4).equals(a)) {
                            String group = matcher2.group(i);
                            String a2 = m102932a(b);
                            int length2 = String.valueOf(group).length();
                            StringBuilder sb = new StringBuilder(length2 + 1 + String.valueOf(a).length() + String.valueOf(a2).length());
                            sb.append(group);
                            sb.append(a);
                            sb.append("=");
                            sb.append(a2);
                            matcher2.appendReplacement(stringBuffer, sb.toString());
                            i = 1;
                            i4 = 2;
                        } else {
                            matcher2.appendReplacement(stringBuffer, matcher2.group());
                            i = 1;
                            i4 = 2;
                        }
                    }
                    matcher2.appendTail(stringBuffer);
                    httpUriRequest2.addHeader(new BasicHeader(name, stringBuffer.toString()));
                    z = true;
                } else {
                    i3 = 1;
                }
            }
            i2++;
        }
        if (z) {
            return httpUriRequest2;
        }
        String a3 = m102932a(b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(a3).length());
        sb2.append(a);
        sb2.append("=");
        sb2.append(a3);
        httpUriRequest2.addHeader(new BasicHeader("Cookie", sb2.toString()));
        return httpUriRequest2;
    }

    /* renamed from: a */
    private static RequestWrapper m102935a(HttpUriRequest httpUriRequest) {
        EntityEnclosingRequestWrapper entityEnclosingRequestWrapper;
        try {
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                entityEnclosingRequestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpUriRequest);
            } else {
                entityEnclosingRequestWrapper = new RequestWrapper(httpUriRequest);
            }
            entityEnclosingRequestWrapper.resetHeaders();
            return entityEnclosingRequestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }

    /* renamed from: a */
    public static void m102936a(HttpUriRequest httpUriRequest, HttpResponse httpResponse, bixj bixj) {
        if (m102937b(httpUriRequest, bixj)) {
            String a = bixj.mo24524a();
            for (Header header : httpResponse.getHeaders("Set-Cookie")) {
                String a2 = m102933a(header.getValue(), a);
                if (a2 != null) {
                    bixj.mo24525a(a2);
                }
            }
            for (Header header2 : httpResponse.getHeaders("Set-Cookie2")) {
                String a3 = m102933a(header2.getValue(), a);
                if (a3 != null) {
                    bixj.mo24525a(a3);
                }
            }
        }
    }
}
