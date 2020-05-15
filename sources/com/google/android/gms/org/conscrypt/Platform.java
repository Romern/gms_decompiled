package com.google.android.gms.org.conscrypt;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.org.conscrypt.p058ct.CTLogStore;
import com.google.android.gms.org.conscrypt.p058ct.CTPolicy;
import dalvik.system.BlockGuard;
import dalvik.system.CloseGuard;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;
import java.security.AlgorithmParameters;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class Platform {
    private static final String TAG = "Conscrypt";

    /* renamed from: a */
    public static final /* synthetic */ int f81431a = 0;
    private static Method m_getCurveName;

    static {
        try {
            Method declaredMethod = ECParameterSpec.class.getDeclaredMethod("getCurveName", new Class[0]);
            m_getCurveName = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
        }
    }

    private Platform() {
    }

    public static void blockGuardOnNetwork() {
        BlockGuard.getThreadPolicy().onNetwork();
    }

    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) {
        if (!checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket) && !checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) {
        if (!checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket) && !checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    private static boolean checkTrusted(String str, X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str2, Class cls, Object obj) {
        try {
            x509TrustManager.getClass().getMethod(str, X509Certificate[].class, String.class, cls).invoke(x509TrustManager, x509CertificateArr, str2, obj);
            return true;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            return false;
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof CertificateException) {
                throw ((CertificateException) e2.getCause());
            }
            throw new RuntimeException(e2.getCause());
        }
    }

    public static void closeGuardClose(Object obj) {
        int i = Build.VERSION.SDK_INT;
        ((CloseGuard) obj).close();
    }

    public static CloseGuard closeGuardGet() {
        int i = Build.VERSION.SDK_INT;
        return CloseGuard.get();
    }

    public static void closeGuardOpen(Object obj, String str) {
        int i = Build.VERSION.SDK_INT;
        ((CloseGuard) obj).open(str);
    }

    public static void closeGuardWarnIfOpen(Object obj) {
        int i = Build.VERSION.SDK_INT;
        ((CloseGuard) obj).warnIfOpen();
    }

    static ConscryptEngineSocket createEngineSocket(SSLParametersImpl sSLParametersImpl) {
        int i = Build.VERSION.SDK_INT;
        return new Java8EngineSocket(sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        int i = Build.VERSION.SDK_INT;
        return new Java8FileDescriptorSocket(sSLParametersImpl);
    }

    public static GCMParameters fromGCMParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        if (cls == null || !cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
            return null;
        }
        try {
            return new GCMParameters(((Integer) cls.getMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) cls.getMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]));
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Could not fetch GCM parameters", e4.getTargetException());
        }
    }

    static AlgorithmParameterSpec fromGCMParameters(AlgorithmParameters algorithmParameters) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        if (cls != null) {
            try {
                return algorithmParameters.getParameterSpec(cls);
            } catch (InvalidParameterSpecException e2) {
            }
        }
        return null;
    }

    private static Class getClass(String... strArr) {
        int i = 0;
        while (i < strArr.length) {
            try {
                return Class.forName(strArr[i]);
            } catch (Exception e) {
                i++;
            }
        }
        return null;
    }

    public static String getCurveName(ECParameterSpec eCParameterSpec) {
        Method method = m_getCurveName;
        if (method != null) {
            try {
                return (String) method.invoke(eCParameterSpec, new Object[0]);
            } catch (Exception e) {
            }
        }
        return null;
    }

    static KeyStore getDefaultCertKeyStore() {
        KeyStore instance = KeyStore.getInstance("AndroidCAStore");
        try {
            instance.load(null, null);
            return instance;
        } catch (IOException e) {
            throw new KeyStoreException(e);
        } catch (CertificateException e2) {
            throw new KeyStoreException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new KeyStoreException(e3);
        }
    }

    public static String getDefaultProviderName() {
        return TAG;
    }

    public static String getEndpointIdentificationAlgorithm(SSLParameters sSLParameters) {
        return null;
    }

    public static FileDescriptor getFileDescriptor(Socket socket) {
        try {
            Field declaredField = Socket.class.getDeclaredField("impl");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(socket);
            Field declaredField2 = SocketImpl.class.getDeclaredField("fd");
            declaredField2.setAccessible(true);
            return (FileDescriptor) declaredField2.get(obj);
        } catch (Exception e) {
            throw new RuntimeException("Can't get FileDescriptor from socket", e);
        }
    }

    public static FileDescriptor getFileDescriptorFromSSLSocket(AbstractConscryptSocket abstractConscryptSocket) {
        return getFileDescriptor(abstractConscryptSocket);
    }

    public static String getHostStringFromInetSocketAddress(InetSocketAddress inetSocketAddress) {
        int i = Build.VERSION.SDK_INT;
        try {
            return (String) InetSocketAddress.class.getDeclaredMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (Exception e2) {
            return null;
        }
    }

    public static String getOriginalHostNameFromInetAddress(InetAddress inetAddress) {
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = InetAddress.class.getDeclaredMethod("holder", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = Class.forName("java.net.InetAddress$InetAddressHolder").getDeclaredMethod("getOriginalHostName", new Class[0]);
            declaredMethod2.setAccessible(true);
            String str = (String) declaredMethod2.invoke(declaredMethod.invoke(inetAddress, new Object[0]), new Object[0]);
            return str == null ? inetAddress.getHostAddress() : str;
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Failed to get originalHostName", e);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e2) {
            return inetAddress.getHostAddress();
        }
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            int i = Build.VERSION.SDK_INT;
            setParametersSniHostname(sSLParameters, sSLParametersImpl, abstractConscryptSocket);
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    private static void getSSLParametersFromImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParameters.getClass().getMethod("setEndpointIdentificationAlgorithm", String.class).invoke(sSLParameters, sSLParametersImpl.getEndpointIdentificationAlgorithm());
        sSLParameters.getClass().getMethod("setUseCipherSuitesOrder", Boolean.TYPE).invoke(sSLParameters, Boolean.valueOf(sSLParametersImpl.getUseCipherSuitesOrder()));
    }

    private static String getSniHostnameFromParams(SSLParameters sSLParameters) {
        List<SNIServerName> list = (List) sSLParameters.getClass().getMethod("getServerNames", new Class[0]).invoke(sSLParameters, new Object[0]);
        if (list == null) {
            return null;
        }
        for (SNIServerName sNIServerName : list) {
            if (sNIServerName.getType() == 0) {
                return ((SNIHostName) sNIServerName).getAsciiName();
            }
        }
        return null;
    }

    public static boolean isCTVerificationRequired(String str) {
        String property;
        boolean z = false;
        if (!(str == null || (property = Security.getProperty("conscrypt.ct.enable")) == null || !Boolean.valueOf(property).booleanValue())) {
            List<String> asList = Arrays.asList(str.split("\\."));
            Collections.reverse(asList);
            String str2 = "conscrypt.ct.enforce";
            for (String str3 : asList) {
                String property2 = Security.getProperty(String.valueOf(str2).concat(".*"));
                if (property2 != null) {
                    z = Boolean.valueOf(property2).booleanValue();
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append(".");
                sb.append(str3);
                str2 = sb.toString();
            }
            String property3 = Security.getProperty(str2);
            if (property3 != null) {
                return Boolean.valueOf(property3).booleanValue();
            }
        }
        return z;
    }

    public static void logEvent(String str) {
        try {
            Class<?> cls = Class.forName("android.os.Process");
            int intValue = ((Integer) cls.getMethod("myUid", null).invoke(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0])).intValue();
            Class<?> cls2 = Class.forName("android.util.EventLog");
            Object newInstance = cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            cls2.getMethod("writeEvent", Integer.TYPE, Object[].class).invoke(newInstance, 1397638484, new Object[]{"conscrypt", Integer.valueOf(intValue), str});
        } catch (Exception e) {
        }
    }

    private static void logStackTraceSnippet(String str, Throwable th) {
        Log.w(TAG, str);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i = 0;
        while (i < 2 && i < stackTrace.length) {
            String valueOf = String.valueOf(stackTrace[i].toString());
            Log.w(TAG, valueOf.length() == 0 ? new String("\tat ") : "\tat ".concat(valueOf));
            i++;
        }
    }

    static CertBlacklist newDefaultBlacklist() {
        return null;
    }

    static ConscryptCertStore newDefaultCertStore() {
        return null;
    }

    static CTLogStore newDefaultLogStore() {
        return null;
    }

    static CTPolicy newDefaultPolicy(CTLogStore cTLogStore) {
        return null;
    }

    public static String oidToAlgorithmName(String str) {
        try {
            Method declaredMethod = Class.forName("org.apache.harmony.security.utils.AlgNameMapper").getDeclaredMethod("map2AlgName", String.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, str);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            try {
                Class<?> cls = Class.forName("sun.security.x509.AlgorithmId");
                Method declaredMethod2 = cls.getDeclaredMethod("get", String.class);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getName", new Class[0]);
                declaredMethod3.setAccessible(true);
                return (String) declaredMethod3.invoke(declaredMethod2.invoke(null, str), new Object[0]);
            } catch (InvocationTargetException e3) {
                Throwable cause2 = e3.getCause();
                if (cause2 instanceof RuntimeException) {
                    throw ((RuntimeException) cause2);
                } else if (cause2 instanceof Error) {
                    throw ((Error) cause2);
                } else {
                    throw new RuntimeException(e3);
                }
            } catch (Exception e4) {
                return str;
            }
        }
    }

    static boolean provideTrustManagerByDefault() {
        return false;
    }

    public static void setCurveName(ECParameterSpec eCParameterSpec, String str) {
        try {
            eCParameterSpec.getClass().getDeclaredMethod("setCurveName", String.class).invoke(eCParameterSpec, str);
        } catch (Exception e) {
        }
    }

    public static void setEndpointIdentificationAlgorithm(SSLParameters sSLParameters, String str) {
    }

    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(abstractConscryptSocket.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", List.class).invoke(sSLParameters, Collections.singletonList(new SNIHostName(abstractConscryptSocket.getHostname())));
        }
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            int i = Build.VERSION.SDK_INT;
            String sniHostnameFromParams = getSniHostnameFromParams(sSLParameters);
            if (sniHostnameFromParams != null) {
                abstractConscryptSocket.setHostname(sniHostnameFromParams);
            }
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    private static void setSSLParametersOnImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParametersImpl.setEndpointIdentificationAlgorithm((String) sSLParameters.getClass().getMethod("getEndpointIdentificationAlgorithm", new Class[0]).invoke(sSLParameters, new Object[0]));
        sSLParametersImpl.setUseCipherSuitesOrder(((Boolean) sSLParameters.getClass().getMethod("getUseCipherSuitesOrder", new Class[0]).invoke(sSLParameters, new Object[0])).booleanValue());
    }

    public static void setSocketWriteTimeout(Socket socket, long j) {
        try {
            FileDescriptor fileDescriptor = getFileDescriptor(socket);
            if (fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket closed");
            }
            Class cls = getClass("android.system.StructTimeval", "libcore.io.StructTimeval");
            if (cls != null) {
                Method declaredMethod = cls.getDeclaredMethod("fromMillis", Long.TYPE);
                if (declaredMethod != null) {
                    Object invoke = declaredMethod.invoke(null, Long.valueOf(j));
                    Class<?> cls2 = Class.forName("libcore.io.Libcore");
                    if (cls2 == null) {
                        Log.w(TAG, "Libcore == null; not setting socket write timeout");
                        return;
                    }
                    Field field = cls2.getField("os");
                    if (field == null) {
                        Log.w(TAG, "os == null; not setting socket write timeout");
                        return;
                    }
                    Object obj = field.get(null);
                    if (obj != null) {
                        Class cls3 = getClass("android.system.OsConstants", "libcore.io.OsConstants");
                        if (cls3 == null) {
                            Log.w(TAG, "OsConstants == null; not setting socket write timeout");
                            return;
                        }
                        Field field2 = cls3.getField("SOL_SOCKET");
                        if (field2 == null) {
                            Log.w(TAG, "SOL_SOCKET == null; not setting socket write timeout");
                            return;
                        }
                        Field field3 = cls3.getField("SO_SNDTIMEO");
                        if (field3 != null) {
                            Method method = obj.getClass().getMethod("setsockoptTimeval", FileDescriptor.class, Integer.TYPE, Integer.TYPE, cls);
                            if (method != null) {
                                method.invoke(obj, fileDescriptor, field2.get(null), field3.get(null), invoke);
                                return;
                            }
                            Log.w(TAG, "setsockoptTimeval == null; not setting socket write timeout");
                            return;
                        }
                        Log.w(TAG, "SO_SNDTIMEO == null; not setting socket write timeout");
                        return;
                    }
                    Log.w(TAG, "instance_os == null; not setting socket write timeout");
                    return;
                }
                Log.w(TAG, "fromMillis == null; not setting socket write timeout");
                return;
            }
            Log.w(TAG, "StructTimeval == null; not setting socket write timeout");
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not set socket write timeout: ");
            sb.append(valueOf);
            logStackTraceSnippet(sb.toString(), e);
            for (Throwable cause = e.getCause(); cause != null; cause = cause.getCause()) {
                String valueOf2 = String.valueOf(cause);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
                sb2.append("Caused by: ");
                sb2.append(valueOf2);
                logStackTraceSnippet(sb2.toString(), cause);
            }
        }
    }

    public static void setup() {
    }

    static boolean supportsConscryptCertStore() {
        return false;
    }

    static boolean supportsX509ExtendedTrustManager() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    public static AlgorithmParameterSpec toGCMParameterSpec(int i, byte[] bArr) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AlgorithmParameterSpec) cls.getConstructor(Integer.TYPE, byte[].class).newInstance(Integer.valueOf(i), bArr);
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException e2) {
                bqye.m113758a(e2);
            } catch (InvocationTargetException e3) {
                bqye.m113758a(e3.getCause());
            }
        }
        return null;
    }

    static SSLEngine unwrapEngine(SSLEngine sSLEngine) {
        return sSLEngine;
    }

    static SSLEngine wrapEngine(ConscryptEngine conscryptEngine) {
        return conscryptEngine;
    }

    public static OpenSSLKey wrapRsaKey(PrivateKey privateKey) {
        int i = Build.VERSION.SDK_INT;
        return null;
    }

    public static SSLSession wrapSSLSession(ExternalSession externalSession) {
        int i = Build.VERSION.SDK_INT;
        return new Java8ExtendedSSLSession(externalSession);
    }

    public static SSLSocketFactory wrapSocketFactoryIfNeeded(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        return openSSLSocketFactoryImpl;
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        int i2 = Build.VERSION.SDK_INT;
        return new Java8EngineSocket(str, i, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        int i2 = Build.VERSION.SDK_INT;
        return new Java8FileDescriptorSocket(str, i, sSLParametersImpl);
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        int i3 = Build.VERSION.SDK_INT;
        return new Java8EngineSocket(str, i, inetAddress, i2, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        int i3 = Build.VERSION.SDK_INT;
        return new Java8FileDescriptorSocket(str, i, inetAddress, i2, sSLParametersImpl);
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        int i2 = Build.VERSION.SDK_INT;
        return new Java8EngineSocket(inetAddress, i, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        int i2 = Build.VERSION.SDK_INT;
        return new Java8FileDescriptorSocket(inetAddress, i, sSLParametersImpl);
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            int i = Build.VERSION.SDK_INT;
            setParametersSniHostname(sSLParameters, sSLParametersImpl, conscryptEngine);
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(conscryptEngine.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", List.class).invoke(sSLParameters, Collections.singletonList(new SNIHostName(conscryptEngine.getHostname())));
        }
    }

    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) {
        if (!checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine) && !checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) {
        if (!checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine) && !checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        int i3 = Build.VERSION.SDK_INT;
        return new Java8EngineSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        int i3 = Build.VERSION.SDK_INT;
        return new Java8FileDescriptorSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            int i = Build.VERSION.SDK_INT;
            String sniHostnameFromParams = getSniHostnameFromParams(sSLParameters);
            if (sniHostnameFromParams != null) {
                conscryptEngine.setHostname(sniHostnameFromParams);
            }
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    static ConscryptEngineSocket createEngineSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        int i2 = Build.VERSION.SDK_INT;
        return new Java8EngineSocket(socket, str, i, z, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        int i2 = Build.VERSION.SDK_INT;
        return new Java8FileDescriptorSocket(socket, str, i, z, sSLParametersImpl);
    }
}
