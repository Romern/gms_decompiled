package com.felicanetworks.cmnlib.log;

import android.util.Log;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.ExceptionCodeInterface;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.p005sg.SgMgr;
import com.felicanetworks.cmnlib.p005sg.SgMgrException;
import com.felicanetworks.cmnlib.util.CommonUtil;
import com.felicanetworks.cmnlib.util.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LogMgr implements FunctionCodeInterface {
    private static final String APP_STC = "STC";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DateFormatter.DATE_TIME_MSEC);
    private static final int EXCEPTION_ATTR = 1024;
    private static final int EXP_MESSAGE_DIGITS_LINENUMBER = 4;
    private static final int EXP_MESSAGE_DISPLAY_COUNT = 3;
    private static final String EXP_MESSAGE_LINENUMBER_SEPARATOR = ":";
    private static final String EXP_MESSAGE_METHOD_SEPARATOR = "#";
    private static final String FIELD_SEPARATOR = ",";
    private static final int IDENTIFIRECODE_DIGITS_CLASSID = 3;
    private static final int IDENTIFIRECODE_DIGITS_EXPID = 3;
    private static final int IDENTIFIRECODE_DIGITS_FUNCID = 2;
    private static final int IDENTIFIRECODE_DIGITS_LINENUMBER = 4;
    private static final int IDENTIFIRECODE_NONE_ID = 0;
    private static final String IDENTIFIRECODE_SEPARATOR = "-";
    private static final int IDENTIFIRECODE_UNKNOWN_ERR_ID = 4095;
    private static final int LOGGER_DIGITS_LINENUMBER = 4;
    private static final String LOGGER_LINENUMBER_SEPARATOR = ":";
    private static final String LOGGER_METHOD_SEPARATOR = "#";
    static final String MSG_TIME_ZONE_CANT_GET = "Timezone hasn't been set.";
    private static final int RUNTIME_ATTR = 2048;
    private static String appName = null;
    private static final Map exceptionIdentifierCodeMap;
    private static final Map runtimeExceptionIdentifierCodeMap;
    private AppContext context;
    DateFormatter dateFormatter;

    /* renamed from: com.felicanetworks.cmnlib.log.LogMgr$1 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C00881 {
        static final /* synthetic */ int[] $SwitchMap$com$felicanetworks$cmnlib$log$LogMgr$CatExp;

        static {
            int[] iArr = new int[CatExp.values().length];
            $SwitchMap$com$felicanetworks$cmnlib$log$LogMgr$CatExp = iArr;
            try {
                iArr[CatExp.ERR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$felicanetworks$cmnlib$log$LogMgr$CatExp[CatExp.WAR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum CatDev {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum CatExp {
        ERR,
        WAR
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class LogFormatter {
        protected String date = "";
        protected String dbgData = "";
        protected String dbgMsg = "";
        protected String expClassName = "";
        protected String expMsg = "";
        protected String identifyCode = "";
        protected String loggerInfo = "";
        protected String tag = "";

        public String toString() {
            return this.tag + LogMgr.FIELD_SEPARATOR + this.date + LogMgr.FIELD_SEPARATOR + this.identifyCode + LogMgr.FIELD_SEPARATOR + this.loggerInfo + LogMgr.FIELD_SEPARATOR + this.expClassName + LogMgr.FIELD_SEPARATOR + this.expMsg + LogMgr.FIELD_SEPARATOR + this.dbgMsg + LogMgr.FIELD_SEPARATOR + this.dbgData;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class StackTraceFormatter {

        /* renamed from: st */
        StackTraceElement[] f7372st;

        public StackTraceFormatter(StackTraceElement[] stackTraceElementArr) {
            this.f7372st = stackTraceElementArr;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("");
            int i = 0;
            while (i < 3 && i < this.f7372st.length) {
                stringBuffer.append("[" + i + "]" + CommonUtil.getClassShortName(this.f7372st[i].getClassName()) + "#" + this.f7372st[i].getMethodName() + ":" + CommonUtil.intToDecString(this.f7372st[i].getLineNumber(), 4));
                i++;
            }
            return stringBuffer.toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        runtimeExceptionIdentifierCodeMap = hashMap;
        hashMap.put("ActivityNotFoundException", 2049);
        runtimeExceptionIdentifierCodeMap.put("AndroidRuntimeException", 2050);
        runtimeExceptionIdentifierCodeMap.put("AnnotationTypeMismatchException", 2051);
        runtimeExceptionIdentifierCodeMap.put("ArithmeticException", 2052);
        runtimeExceptionIdentifierCodeMap.put("ArrayStoreException", 2053);
        runtimeExceptionIdentifierCodeMap.put("BufferOverflowException", 2054);
        runtimeExceptionIdentifierCodeMap.put("BufferUnderflowException", 2055);
        runtimeExceptionIdentifierCodeMap.put("ClassCastException", 2056);
        runtimeExceptionIdentifierCodeMap.put("ConcurrentModificationException", 2057);
        runtimeExceptionIdentifierCodeMap.put("DOMException", 2058);
        runtimeExceptionIdentifierCodeMap.put("EmptyStackException", 2059);
        runtimeExceptionIdentifierCodeMap.put("EnumConstantNotPresentException", 2060);
        runtimeExceptionIdentifierCodeMap.put("GLException", 2061);
        runtimeExceptionIdentifierCodeMap.put("IllegalArgumentException", 2062);
        runtimeExceptionIdentifierCodeMap.put("IllegalMonitorStateException", 2063);
        runtimeExceptionIdentifierCodeMap.put("IllegalStateException", 2064);
        runtimeExceptionIdentifierCodeMap.put("IncompleteAnnotationException", 2065);
        runtimeExceptionIdentifierCodeMap.put("IndexOutOfBoundsException", 2066);
        runtimeExceptionIdentifierCodeMap.put("InflateException", 2067);
        runtimeExceptionIdentifierCodeMap.put("MalformedParameterizedTypeException", 2068);
        runtimeExceptionIdentifierCodeMap.put("MissingResourceException", 2069);
        runtimeExceptionIdentifierCodeMap.put("NegativeArraySizeException", 2070);
        runtimeExceptionIdentifierCodeMap.put("NoSuchElementException", 2071);
        runtimeExceptionIdentifierCodeMap.put("NullPointerException", 2072);
        runtimeExceptionIdentifierCodeMap.put("ParcelFormatException", 2073);
        runtimeExceptionIdentifierCodeMap.put("ParseException", 2074);
        runtimeExceptionIdentifierCodeMap.put("ProviderException", 2075);
        runtimeExceptionIdentifierCodeMap.put("RejectedExecutionException", 2076);
        runtimeExceptionIdentifierCodeMap.put("ActionException", 2077);
        runtimeExceptionIdentifierCodeMap.put("NotFoundException", 2078);
        runtimeExceptionIdentifierCodeMap.put("SQLException", 2079);
        runtimeExceptionIdentifierCodeMap.put("SecurityException", 2080);
        runtimeExceptionIdentifierCodeMap.put("StaleDataException", 2081);
        runtimeExceptionIdentifierCodeMap.put("BadSurfaceTypeException", 2082);
        runtimeExceptionIdentifierCodeMap.put("TimeFormatException", 2083);
        runtimeExceptionIdentifierCodeMap.put("TypeNotPresentException", 2084);
        runtimeExceptionIdentifierCodeMap.put("UndeclaredThrowableException", 2085);
        runtimeExceptionIdentifierCodeMap.put("UnsupportedDigestAlgorithmException", 2086);
        runtimeExceptionIdentifierCodeMap.put("UnsupportedOperationException", 2087);
        runtimeExceptionIdentifierCodeMap.put("BadTokenException", 2088);
        runtimeExceptionIdentifierCodeMap.put("AccessControlException", 2089);
        runtimeExceptionIdentifierCodeMap.put("AlreadyConnectedException", 2090);
        runtimeExceptionIdentifierCodeMap.put("ArrayIndexOutOfBoundsException", 2091);
        runtimeExceptionIdentifierCodeMap.put("BadParcelableException", 2092);
        runtimeExceptionIdentifierCodeMap.put("CancellationException", 2093);
        runtimeExceptionIdentifierCodeMap.put("CancelledKeyException", 2094);
        runtimeExceptionIdentifierCodeMap.put("ClosedSelectorException", 2095);
        runtimeExceptionIdentifierCodeMap.put("ConnectionPendingException", 2096);
        runtimeExceptionIdentifierCodeMap.put("CursorIndexOutOfBoundsException", 2097);
        runtimeExceptionIdentifierCodeMap.put("DuplicateFormatFlagsException", 2098);
        runtimeExceptionIdentifierCodeMap.put("FormatFlagsConversionMismatchException", 2099);
        runtimeExceptionIdentifierCodeMap.put("FormatterClosedException", 2100);
        runtimeExceptionIdentifierCodeMap.put("IllegalBlockingModeException", 2101);
        runtimeExceptionIdentifierCodeMap.put("IllegalCharsetNameException", 2102);
        runtimeExceptionIdentifierCodeMap.put("IllegalFormatCodePointException", 2103);
        runtimeExceptionIdentifierCodeMap.put("IllegalFormatConversionException", 2104);
        runtimeExceptionIdentifierCodeMap.put("IllegalFormatException", 2105);
        runtimeExceptionIdentifierCodeMap.put("IllegalFormatFlagsException", 2106);
        runtimeExceptionIdentifierCodeMap.put("IllegalFormatPrecisionException", 2107);
        runtimeExceptionIdentifierCodeMap.put("IllegalFormatWidthException", 2108);
        runtimeExceptionIdentifierCodeMap.put("IllegalSelectorException", 2109);
        runtimeExceptionIdentifierCodeMap.put("IllegalThreadStateException", 2110);
        runtimeExceptionIdentifierCodeMap.put("InputMismatchException", 2112);
        runtimeExceptionIdentifierCodeMap.put("InvalidMarkException", 2113);
        runtimeExceptionIdentifierCodeMap.put("InvalidParameterException", 2114);
        runtimeExceptionIdentifierCodeMap.put("MissingFormatArgumentException", 2115);
        runtimeExceptionIdentifierCodeMap.put("MissingFormatWidthException", 2116);
        runtimeExceptionIdentifierCodeMap.put("NoConnectionPendingException", 2117);
        runtimeExceptionIdentifierCodeMap.put("NonReadableChannelException", 2118);
        runtimeExceptionIdentifierCodeMap.put("NonWritableChannelException", 2119);
        runtimeExceptionIdentifierCodeMap.put("NotYetBoundException", 2120);
        runtimeExceptionIdentifierCodeMap.put("NotYetConnectedException", 2121);
        runtimeExceptionIdentifierCodeMap.put("NumberFormatException", 2122);
        runtimeExceptionIdentifierCodeMap.put("OverlappingFileLockException", 2123);
        runtimeExceptionIdentifierCodeMap.put("PatternSyntaxException", 2124);
        runtimeExceptionIdentifierCodeMap.put("ReadOnlyBufferException", 2125);
        runtimeExceptionIdentifierCodeMap.put("ReceiverCallNotAllowedException", 2126);
        runtimeExceptionIdentifierCodeMap.put("SQLiteAbortException", 2127);
        runtimeExceptionIdentifierCodeMap.put("SQLiteConstraintException", 2128);
        runtimeExceptionIdentifierCodeMap.put("SQLiteDatabaseCorruptException", 2129);
        runtimeExceptionIdentifierCodeMap.put("SQLiteDiskIOException", 2130);
        runtimeExceptionIdentifierCodeMap.put("SQLiteDoneException", 2131);
        runtimeExceptionIdentifierCodeMap.put("SQLiteException", 2132);
        runtimeExceptionIdentifierCodeMap.put("SQLiteFullException", 2133);
        runtimeExceptionIdentifierCodeMap.put("SQLiteMisuseException", 2134);
        runtimeExceptionIdentifierCodeMap.put("StringIndexOutOfBoundsException", 2135);
        runtimeExceptionIdentifierCodeMap.put("UnknownFormatConversionException", 2136);
        runtimeExceptionIdentifierCodeMap.put("UnknownFormatFlagsException", 2137);
        runtimeExceptionIdentifierCodeMap.put("UnresolvedAddressException", 2138);
        runtimeExceptionIdentifierCodeMap.put("UnsupportedAddressTypeException", 2139);
        runtimeExceptionIdentifierCodeMap.put("UnsupportedCharsetException", 2140);
        HashMap hashMap2 = new HashMap();
        exceptionIdentifierCodeMap = hashMap2;
        hashMap2.put("Exception", 1025);
        exceptionIdentifierCodeMap.put("AccountsException", 1026);
        exceptionIdentifierCodeMap.put("AuthenticatorException", 1027);
        exceptionIdentifierCodeMap.put("NetworkErrorException", 1028);
        exceptionIdentifierCodeMap.put("OperationCanceledException", 1029);
        exceptionIdentifierCodeMap.put("AclNotFoundException", 1030);
        exceptionIdentifierCodeMap.put("AndroidException", 1031);
        exceptionIdentifierCodeMap.put("BackingStoreException", 1032);
        exceptionIdentifierCodeMap.put("BrokenBarrierException", 1033);
        exceptionIdentifierCodeMap.put("CertificateException", 1034);
        exceptionIdentifierCodeMap.put("CertificateEncodingException", 1035);
        exceptionIdentifierCodeMap.put("CertificateExpiredException", 1036);
        exceptionIdentifierCodeMap.put("CertificateNotYetValidException", 1037);
        exceptionIdentifierCodeMap.put("CertificateParsingException", 1038);
        exceptionIdentifierCodeMap.put("ClassNotFoundException", 1039);
        exceptionIdentifierCodeMap.put("CloneNotSupportedException", 1040);
        exceptionIdentifierCodeMap.put("DataFormatException", 1041);
        exceptionIdentifierCodeMap.put("DateParseException", 1042);
        exceptionIdentifierCodeMap.put("DestroyFailedException", 1043);
        exceptionIdentifierCodeMap.put("ExecutionException", 1044);
        exceptionIdentifierCodeMap.put("GeneralSecurityException", 1045);
        exceptionIdentifierCodeMap.put("BadPaddingException", 1046);
        exceptionIdentifierCodeMap.put("CRLException", 1047);
        exceptionIdentifierCodeMap.put("CertPathBuilderException", 1048);
        exceptionIdentifierCodeMap.put("CertPathValidatorException", 1049);
        exceptionIdentifierCodeMap.put("CertStoreException", 1050);
        exceptionIdentifierCodeMap.put("DigestException", 1052);
        exceptionIdentifierCodeMap.put("ExemptionMechanismException", 1053);
        exceptionIdentifierCodeMap.put("IllegalBlockSizeException", 1054);
        exceptionIdentifierCodeMap.put("InvalidAlgorithmParameterException", 1056);
        exceptionIdentifierCodeMap.put("InvalidKeySpecException", 1057);
        exceptionIdentifierCodeMap.put("InvalidParameterSpecException", 1058);
        exceptionIdentifierCodeMap.put("KeyException", 1059);
        exceptionIdentifierCodeMap.put("KeyStoreException", 1060);
        exceptionIdentifierCodeMap.put("LoginException", 1061);
        exceptionIdentifierCodeMap.put("NoSuchAlgorithmException", 1062);
        exceptionIdentifierCodeMap.put("NoSuchPaddingException", 1063);
        exceptionIdentifierCodeMap.put("NoSuchProviderException", 1064);
        exceptionIdentifierCodeMap.put("ShortBufferException", 1065);
        exceptionIdentifierCodeMap.put("SignatureException", 1066);
        exceptionIdentifierCodeMap.put("UnrecoverableEntryException", 1067);
        exceptionIdentifierCodeMap.put("UnrecoverableKeyException", 1068);
        exceptionIdentifierCodeMap.put("InvalidKeyException", 1069);
        exceptionIdentifierCodeMap.put("KeyManagementException", 1070);
        exceptionIdentifierCodeMap.put("HttpException", 1071);
        exceptionIdentifierCodeMap.put("MethodNotSupportedException", 1072);
        exceptionIdentifierCodeMap.put("ProtocolException", 1073);
        exceptionIdentifierCodeMap.put("TunnelRefusedException", 1074);
        exceptionIdentifierCodeMap.put("AuthenticationException", 1075);
        exceptionIdentifierCodeMap.put("CircularRedirectException", 1076);
        exceptionIdentifierCodeMap.put("InvalidCredentialsException", 1077);
        exceptionIdentifierCodeMap.put("MalformedChallengeException", 1078);
        exceptionIdentifierCodeMap.put("MalformedCookieException", 1079);
        exceptionIdentifierCodeMap.put("NTLMEngineException", 1080);
        exceptionIdentifierCodeMap.put("NonRepeatableRequestException", 1081);
        exceptionIdentifierCodeMap.put("RedirectException", 1082);
        exceptionIdentifierCodeMap.put("UnsupportedHttpVersionException", 1083);
        exceptionIdentifierCodeMap.put("IOException", 1084);
        exceptionIdentifierCodeMap.put("CharConversionException", 1085);
        exceptionIdentifierCodeMap.put("CharacterCodingException", 1086);
        exceptionIdentifierCodeMap.put("ClientProtocolException", 1087);
        exceptionIdentifierCodeMap.put("ClosedChannelException", 1088);
        exceptionIdentifierCodeMap.put("ConnectionClosedException", 1089);
        exceptionIdentifierCodeMap.put("EOFException", 1090);
        exceptionIdentifierCodeMap.put("FileLockInterruptionException", 1091);
        exceptionIdentifierCodeMap.put("FileNotFoundException", 1092);
        exceptionIdentifierCodeMap.put("HttpRetryException", 1093);
        exceptionIdentifierCodeMap.put("InterruptedIOException", 1094);
        exceptionIdentifierCodeMap.put("InvalidPropertiesFormatException", 1095);
        exceptionIdentifierCodeMap.put("MalformedChunkCodingException", 1096);
        exceptionIdentifierCodeMap.put("MalformedURLException", 1097);
        exceptionIdentifierCodeMap.put("NoHttpResponseException", 1098);
        exceptionIdentifierCodeMap.put("ObjectStreamException", 1099);
        exceptionIdentifierCodeMap.put("SSLException", 1101);
        exceptionIdentifierCodeMap.put("SocketException", 1102);
        exceptionIdentifierCodeMap.put("SyncFailedException", 1103);
        exceptionIdentifierCodeMap.put("UTFDataFormatException", 1104);
        exceptionIdentifierCodeMap.put("UnknownHostException", 1105);
        exceptionIdentifierCodeMap.put("UnknownServiceException", 1106);
        exceptionIdentifierCodeMap.put("UnsupportedEncodingException", 1107);
        exceptionIdentifierCodeMap.put("ZipException", 1108);
        exceptionIdentifierCodeMap.put("AsynchronousCloseException", 1109);
        exceptionIdentifierCodeMap.put("BindException", 1110);
        exceptionIdentifierCodeMap.put("ClosedByInterruptException", 1111);
        exceptionIdentifierCodeMap.put("ConnectException", 1112);
        exceptionIdentifierCodeMap.put("ConnectTimeoutException", 1113);
        exceptionIdentifierCodeMap.put("ConnectionPoolTimeoutException", 1114);
        exceptionIdentifierCodeMap.put("HttpHostConnectException", 1115);
        exceptionIdentifierCodeMap.put("HttpResponseException", 1116);
        exceptionIdentifierCodeMap.put("InvalidClassException", 1117);
        exceptionIdentifierCodeMap.put("InvalidObjectException", 1118);
        exceptionIdentifierCodeMap.put("JarException", 1119);
        exceptionIdentifierCodeMap.put("MalformedInputException", 1120);
        exceptionIdentifierCodeMap.put("NoRouteToHostException", 1121);
        exceptionIdentifierCodeMap.put("NotActiveException", 1122);
        exceptionIdentifierCodeMap.put("NotSerializableException", 1123);
        exceptionIdentifierCodeMap.put("OptionalDataException", 1124);
        exceptionIdentifierCodeMap.put("PortUnreachableException", 1125);
        exceptionIdentifierCodeMap.put("SSLHandshakeException", 1126);
        exceptionIdentifierCodeMap.put("SSLKeyException", 1127);
        exceptionIdentifierCodeMap.put("SSLPeerUnverifiedException", 1128);
        exceptionIdentifierCodeMap.put("SSLProtocolException", 1129);
        exceptionIdentifierCodeMap.put("SocketTimeoutException", 1130);
        exceptionIdentifierCodeMap.put("StreamCorruptedException", 1131);
        exceptionIdentifierCodeMap.put("UnmappableCharacterException", 1132);
        exceptionIdentifierCodeMap.put("WriteAbortedException", 1133);
        exceptionIdentifierCodeMap.put("IllegalAccessException", 1134);
        exceptionIdentifierCodeMap.put("InstantiationException", 1135);
        exceptionIdentifierCodeMap.put("InterruptedException", 1136);
        exceptionIdentifierCodeMap.put("InvalidPreferencesFormatException", 1137);
        exceptionIdentifierCodeMap.put("InvocationTargetException", 1138);
        exceptionIdentifierCodeMap.put("JSONException", 1139);
        exceptionIdentifierCodeMap.put("LastOwnerException", 1140);
        exceptionIdentifierCodeMap.put("NoSuchFieldException", 1141);
        exceptionIdentifierCodeMap.put("NoSuchMethodException", 1142);
        exceptionIdentifierCodeMap.put("NotOwnerException", 1143);
        exceptionIdentifierCodeMap.put("OperationApplicationException", 1144);
        exceptionIdentifierCodeMap.put("ParseException", 1145);
        exceptionIdentifierCodeMap.put("ParserConfigurationException", 1146);
        exceptionIdentifierCodeMap.put("PrivilegedActionException", 1147);
        exceptionIdentifierCodeMap.put("SAXException", 1148);
        exceptionIdentifierCodeMap.put("SAXNotRecognizedException", 1149);
        exceptionIdentifierCodeMap.put("SAXNotSupportedException", 1150);
        exceptionIdentifierCodeMap.put("SAXParseException", 1152);
        exceptionIdentifierCodeMap.put("SQLException", 1153);
        exceptionIdentifierCodeMap.put("BatchUpdateException", 1154);
        exceptionIdentifierCodeMap.put("SQLWarning", 1155);
        exceptionIdentifierCodeMap.put("DataTruncation", 1156);
        exceptionIdentifierCodeMap.put("OutOfResourcesException", 1157);
        exceptionIdentifierCodeMap.put("TimeoutException", 1158);
        exceptionIdentifierCodeMap.put("TooManyListenersException", 1159);
        exceptionIdentifierCodeMap.put("URISyntaxException", 1160);
        exceptionIdentifierCodeMap.put("UnsupportedCallbackException", 1161);
        exceptionIdentifierCodeMap.put("XmlPullParserException", 1162);
        exceptionIdentifierCodeMap.put("FelicaException", 1163);
    }

    public LogMgr(AppContext appContext) {
        this.context = appContext;
        try {
            this.dateFormatter = new DateFormatter(DateFormatter.DATE_TIME_MSEC, (String) appContext.sgMgr.getSgValue(SgMgr.KEY_SRV_TIMEZONE));
        } catch (SgMgrException e) {
            throw new IllegalStateException(MSG_TIME_ZONE_CANT_GET);
        }
    }

    protected static void doOut(CatExp catExp, String str, String str2) {
        CatExp catExp2 = CatExp.ERR;
        int ordinal = catExp.ordinal();
        if (ordinal == 0) {
            Log.e(str, str2);
        } else if (ordinal == 1) {
            Log.w(str, str2);
        }
    }

    public static String getErrIdentifierCode(FunctionCodeInterface functionCodeInterface, Exception exc) {
        try {
            String errIdentifierCodeElement = getErrIdentifierCodeElement(functionCodeInterface, new Throwable().getStackTrace()[1], exc);
            if (!(exc instanceof ExceptionCodeInterface)) {
                return errIdentifierCodeElement;
            }
            ExceptionCodeInterface exceptionCodeInterface = (ExceptionCodeInterface) exc;
            return exceptionCodeInterface.getErrIdentifierCode() != null ? exceptionCodeInterface.getErrIdentifierCode() : errIdentifierCodeElement;
        } catch (Exception e) {
            return "";
        }
    }

    protected static String getErrIdentifierCodeElement(FunctionCodeInterface functionCodeInterface, StackTraceElement stackTraceElement, Exception exc) {
        int i;
        if (exc != null) {
            i = getExpIdentifierID(exc);
        } else {
            i = 0;
        }
        return CommonUtil.intToHexString(functionCodeInterface.getFunctionCode(), 2) + IDENTIFIRECODE_SEPARATOR + CommonUtil.intToHexString(functionCodeInterface.getClassCode(), 3) + IDENTIFIRECODE_SEPARATOR + CommonUtil.intToDecString(stackTraceElement.getLineNumber(), 4) + IDENTIFIRECODE_SEPARATOR + CommonUtil.intToHexString(i, 3);
    }

    protected static int getExpIdentifierID(Exception exc) {
        if (exc instanceof ExceptionCodeInterface) {
            return ((ExceptionCodeInterface) exc).getExceptionCode();
        }
        if (exc instanceof RuntimeException) {
            return getExpIdentifierIDFromIdentifierCodeArray(exc, runtimeExceptionIdentifierCodeMap);
        }
        return getExpIdentifierIDFromIdentifierCodeArray(exc, exceptionIdentifierCodeMap);
    }

    protected static int getExpIdentifierIDFromIdentifierCodeArray(Exception exc, Map map) {
        Integer num = (Integer) map.get(exc.getClass().getSimpleName());
        return num != null ? num.intValue() : IDENTIFIRECODE_UNKNOWN_ERR_ID;
    }

    protected static String getLoggerInfoElement(StackTraceElement stackTraceElement) {
        return CommonUtil.getClassShortName(stackTraceElement.getClassName()) + "#" + stackTraceElement.getMethodName() + ":" + CommonUtil.intToDecString(stackTraceElement.getLineNumber(), 4);
    }

    public int getClassCode() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public AppContext getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public String getDateElement() {
        return this.dateFormatter.getSystemTime();
    }

    /* access modifiers changed from: protected */
    public String getExpMsgElement(Exception exc) {
        return exc != null ? exc.getMessage() : "";
    }

    /* access modifiers changed from: protected */
    public String getExpNameElement(Exception exc) {
        return exc != null ? exc.getClass().getSimpleName() : "";
    }

    public int getFunctionCode() {
        return 6;
    }

    /* access modifiers changed from: protected */
    public String getTagElement(CatExp catExp) {
        if (appName == null) {
            appName = this.context.sgMgr.getAppName();
        }
        return appName;
    }

    public String out(CatExp catExp, FunctionCodeInterface functionCodeInterface, Exception exc) {
        try {
            int intValue = ((Integer) this.context.sgMgr.getSgValue(SgMgr.KEY_LOG_OUTPUT_FLG)).intValue();
            if (intValue != 1) {
                if (catExp != CatExp.ERR) {
                    return null;
                }
            }
            LogFormatter logFormatter = new LogFormatter();
            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
            logFormatter.tag = getTagElement(catExp);
            if (catExp != CatExp.ERR) {
                logFormatter.identifyCode = getErrIdentifierCodeElement(functionCodeInterface, stackTraceElement, null);
            } else {
                logFormatter.identifyCode = getErrIdentifierCodeElement(functionCodeInterface, stackTraceElement, exc);
            }
            logFormatter.date = getDateElement();
            logFormatter.loggerInfo = getLoggerInfoElement(stackTraceElement);
            logFormatter.expClassName = getExpNameElement(exc);
            logFormatter.expMsg = getExpMsgElement(exc);
            logFormatter.dbgData = new StackTraceFormatter(exc.getStackTrace()).toString();
            String logFormatter2 = logFormatter.toString();
            if (intValue == 1) {
                doOut(catExp, logFormatter.tag, logFormatter2);
            }
            if (catExp != CatExp.ERR) {
                return null;
            }
            String str = logFormatter.identifyCode;
            if (!(exc instanceof ExceptionCodeInterface)) {
                return str;
            }
            ExceptionCodeInterface exceptionCodeInterface = (ExceptionCodeInterface) exc;
            if (exceptionCodeInterface.getErrIdentifierCode() != null) {
                return exceptionCodeInterface.getErrIdentifierCode();
            }
            return str;
        } catch (Exception e) {
            return null;
        }
    }
}
